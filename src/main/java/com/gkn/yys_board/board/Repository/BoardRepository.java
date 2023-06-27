package com.gkn.yys_board.board.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gkn.yys_board.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

	// 전체 게시글 목록 가져오기
	List<Board> findAll();
}
