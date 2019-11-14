package com.kh.styleblending.member.model.service;

import java.util.ArrayList;

import com.kh.styleblending.admin.model.vo.Ad;
import com.kh.styleblending.member.model.vo.Member;
import com.kh.styleblending.posting.model.vo.Posting;

public interface MyPageService {
	
	// 프로필 페이지 - 프로필 가져오기
	Member selectProfile(Member m);
	
	// 프로필 페이지 - 포스팅한 사진 리스트
	ArrayList<Posting> selectPostingList(Member m);
	
	// 프로필 페이지 - 포스팅 좋아요한 사진 리스트
	ArrayList<Posting> selectLikeList(Member m);
	
	// 프로필 페이지 - 팬 리스트
	ArrayList<Member> selectFanList(Member m);
	
	// 프로필 페이지 - 팔로잉 리스트
	ArrayList<Member> selectFollowingList(Member m);
	
	// 프로필 관리 - 프로필 수정
	int updateProfile(Member m);
	
	// 프로필 관리 - 내 광고 리스트
	ArrayList<Ad> selectAdList(Member m);
	
	// 프로필 관리 - 비밀번호 변경
	int updatePass(Member m);
	
	// 프로필 관리 - 회원 탈퇴
	int deleteMember(String email);
	
	

}