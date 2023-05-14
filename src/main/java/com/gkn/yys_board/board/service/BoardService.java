package com.gkn.yys_board.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gkn.yys_board.board.Repository.BoardRepository;
import com.gkn.yys_board.board.dto.BoardListDto;
import com.gkn.yys_board.board.entity.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;


	@Transactional(readOnly = true)
	public List<BoardListDto> boardList() {
		List<Board> BoardList = boardRepository.findAll();
		List<BoardListDto> boardListDto = new ArrayList<>();

		for (Board board : BoardList) {
			boardListDto.add(new BoardListDto(board));
		}
		return new ArrayList<>(boardListDto);
	}


}
