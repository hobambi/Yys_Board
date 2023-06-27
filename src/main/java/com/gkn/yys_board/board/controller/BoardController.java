package com.gkn.yys_board.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gkn.yys_board.board.dto.BoardDto;
import com.gkn.yys_board.board.dto.BoardListDto;
import com.gkn.yys_board.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardService;


	// 전체 게시글 목록
	@GetMapping
	public List<BoardListDto> boardList() {
		return boardService.boardList();
	}

	// 특정 게시글 정보
	@GetMapping("/{id}")
	public BoardDto board(@PathVariable Long id) {
		return boardService.board(id);
	}

}
