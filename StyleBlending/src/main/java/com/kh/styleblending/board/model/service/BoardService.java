package com.kh.styleblending.board.model.service;

import java.util.ArrayList;

import com.kh.styleblending.board.model.vo.Board;
import com.kh.styleblending.board.model.vo.BoardReply;
import com.kh.styleblending.board.model.vo.FashionBoard;
import com.kh.styleblending.board.model.vo.Image;
import com.kh.styleblending.board.model.vo.PageInfo;

public interface BoardService {
	
	// 게시판 작성하기
	int insertBoard(Board b);
	
	
	// 게시판 상세조회
	Board selectBoard(int bno);
	
	// 게시판 수정
	int updateBoard(Board b);
	
	// 게시판 삭제
	int deleteBoard(int bno);
	
	// 게시글 댓글 리스트 조회
	ArrayList<BoardReply> selectBoardReplyList(int bno);
	
	// 댓글 작성
	int insertBoardReply(BoardReply r);
	
	// 게시판 갯수조회
	int getListCount();

	// 자유게시판과 패션게시판 listselect
	ArrayList<Board> selectList(PageInfo pi);

	ArrayList<FashionBoard> fashionSelectList(PageInfo pi);
	//*********************************************************
	
}
