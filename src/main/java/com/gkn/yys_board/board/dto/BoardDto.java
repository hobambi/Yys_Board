package com.gkn.yys_board.board.dto;

import java.time.LocalDateTime;

import com.gkn.yys_board.board.entity.Board;

// 게시글 Dto
public class BoardDto {

	private Long id;
	private String title;
	private String contents;
	private LocalDateTime createdAt;
	private String relative_board;

	public BoardDto(Board board) {
		this.id = board.getId();
		this.title = board.getTitle();
		this.contents = board.getContents();
		this.createdAt = board.getCreatedAt();
		this.relative_board = board.getRelative_board();
	}
}
