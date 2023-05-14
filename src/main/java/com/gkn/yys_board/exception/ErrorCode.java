package com.gkn.yys_board.exception;

import static org.springframework.http.HttpStatus.*;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

	/* 404 NOT_FOUND : Resource 를 찾을 수 없음 */
	BOARD_NOT_FOUND(NOT_FOUND, "해당 책 정보를 찾을 수 없습니다");

	private final HttpStatus httpStatus;
	private final String detail;
}
