package com.gkn.yys_board.board.dto;

import java.time.LocalDateTime;

import com.gkn.yys_board.board.entity.Board;

import lombok.Getter;

// 게시글 목록 Dto
public class BoardListDto {

	private String title;
	private LocalDateTime createdAt;

	public BoardListDto(Board board){
		this.title = board.getTitle();
		this.createdAt = board.getCreatedAt();
	}
}
