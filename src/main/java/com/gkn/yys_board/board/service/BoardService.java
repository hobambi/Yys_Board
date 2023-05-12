package com.gkn.yys_board.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gkn.yys_board.board.dto.BoardListDto;
import com.gkn.yys_board.board.entity.Board;

public class BoardService {

	@Transactional(readOnly = true)
	public List<BoardListDto> boardList() {
		List<Board> BoardList =
	}
}
