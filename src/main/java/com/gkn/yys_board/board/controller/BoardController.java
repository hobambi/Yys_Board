package com.gkn.yys_board.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gkn.yys_board.board.dto.BoardListDto;
import com.gkn.yys_board.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardService;


	//게시글 목록
	@GetMapping
	public List<BoardListDto> boardList() {
		return boardService.boardList();
	}
}
