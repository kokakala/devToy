package com.kh.styleblending.posting.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.styleblending.member.model.vo.Member;
import com.kh.styleblending.posting.model.vo.Posting;
import com.kh.styleblending.posting.model.vo.PostingReply;
import com.kh.styleblending.posting.model.vo.SelectPosting;
import com.kh.styleblending.posting.model.vo.Style;

@Repository("pDao")
public class PostingDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertPosting(Posting p) {
		return sqlSession.insert("postingMapper.insertPosting", p);
	}
	
	public int insertStyle(Style s) {
		return sqlSession.insert("postingMapper.insertStyle", s);
	}
	
	public Posting selectOnePosting(int id, int mno) {
		
		HashMap map = new HashMap<>();
		map.put("pno", id);
		map.put("mno", mno);
		return sqlSession.selectOne("postingMapper.selectOnePosting", map);
	}
	
	public ArrayList<PostingReply> selectReplyList(int pno) {
		return (ArrayList)sqlSession.selectList("postingMapper.selectReplyList", pno);
	}
	
	public int insertReply(PostingReply r) {
		return sqlSession.insert("postingMapper.insertReply", r);
	}
	
	public ArrayList<Style> selectStyle(int id) {
		return (ArrayList)sqlSession.selectList("postingMapper.selectStyle", id);
	}
	
	public int insertReReply(PostingReply r) {
		return sqlSession.insert("postingMapper.insertReReply", r);
	}
	
	public int insertPostingLike(int pno, int mno) {
		HashMap map = new HashMap<>();
		map.put("pno", pno);
		map.put("mno", mno);
		return sqlSession.insert("postingMapper.insertPostingLike", map);
	}
	
	public int deletePostingLike(int pno, int mno) {
		HashMap map = new HashMap<>();
		map.put("pno", pno);
		map.put("mno", mno);
		return sqlSession.insert("postingMapper.deletePostingLike", map);
	}
	
	public int increasePostingLike(int pno) {
		return sqlSession.update("postingMapper.increasePostingLike");
	}
	
	public int decreasePostingLike(int pno) {
		return sqlSession.update("postingMapper.decreasePostingLike");
	}
	
	public int selectPLikeCount(int pno) {
		return sqlSession.selectOne("postingMapper.selectPLikeCount", pno);
	}
	
	public int selectPLikeCheck(int pno, int mno) {
		HashMap map = new HashMap<>();
		map.put("pno", pno);
		map.put("mno", mno);
		return sqlSession.selectOne("postingMapper.selectPLikeCheck", map);
	}
	
}
