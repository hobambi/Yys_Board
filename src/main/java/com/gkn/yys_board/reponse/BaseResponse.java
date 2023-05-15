package com.gkn.yys_board.reponse;

import org.springframework.http.ResponseEntity;

import com.gkn.yys_board.exception.ErrorCode;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BaseResponse {

	private final String msg;
	private final int statusCode;

	public static ResponseEntity<BaseResponse> toResponseEntity(ErrorCode errorCode) {
		return ResponseEntity
			.status(errorCode.getHttpStatus())
			.header("Content-Type","application/json; charset=UTF-8")
			.body(BaseResponse.builder()
				.msg(errorCode.getDetail())
				.statusCode(errorCode.getHttpStatus().value())
				.build());
	}
}
