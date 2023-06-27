package com.gkn.yys_board.board.service;

import static com.gkn.yys_board.exception.ErrorCode.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gkn.yys_board.board.Repository.BoardRepository;
import com.gkn.yys_board.board.dto.BoardDto;
import com.gkn.yys_board.board.dto.BoardListDto;
import com.gkn.yys_board.board.entity.Board;
import com.gkn.yys_board.exception.CustomException;
import com.gkn.yys_board.exception.ErrorCode;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	// 전체 게시글 목록
	@Transactional(readOnly = true)
	public List<BoardListDto> boardList() {
		List<Board> BoardList = boardRepository.findAll();
		List<BoardListDto> boardListDto = new ArrayList<>();

		for (Board board : BoardList) {
			boardListDto.add(new BoardListDto(board));
		}
		return new ArrayList<>(boardListDto);
	}

	// 게시글 하나 불러오기
	@Transactional(readOnly = true)
	public BoardDto board(Long id) {
		Board board = boardRepository.findById(id).orElseThrow(
			() -> new CustomException(BOARD_NOT_FOUND));
		BoardDto boardDto = new BoardDto(board);
		return boardDto;
	}
}
