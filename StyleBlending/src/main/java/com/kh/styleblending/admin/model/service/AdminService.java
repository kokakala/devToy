package com.kh.styleblending.admin.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.styleblending.admin.model.vo.Ad;
import com.kh.styleblending.admin.model.vo.Declare;
import com.kh.styleblending.admin.model.vo.PageInfo;
import com.kh.styleblending.admin.model.vo.Statistics;
import com.kh.styleblending.member.model.vo.Member;

public interface AdminService {
	
	// 오늘자 새게시물수
	int selectNewBcount();
	
	// 오늘자 가입자수
	ArrayList<Member> selectNewMember();
	
	// 미확인 신고수
	int selectNoCheckDeclare();
	
	// 진행중인 광고
	Ad selectStartAd();
	
	// 총 회원수 조회용
	int getMemberListCount();
	
	// 회원 목록 조회용
	ArrayList<Member> selectMemberList(PageInfo pi);
	
	// 회원 탈퇴
	int deleteMember(ArrayList mno);
	
	// 총 신고수 조회용
	int getDeclareListCount(HashMap cate);
	
	// 신고목록 조회
	ArrayList<Declare> selectDeclareList(PageInfo pi, HashMap cate);
	
	// 신고게시물 삭제
	int deleteDeclareBoard(ArrayList dno);

	// 신고된 해당 게시물 삭제
	int deleteBoard(int type, int bno);
	
	// 신고게시물 상세조회(확인으로 상태값변경)
	int updateIsCheck(String dno);

	// 총 광고수 조회
	int getAdListCount();
	
	// 광고 목록 조회용(페이징포함)
	ArrayList<Ad> selectAdList(PageInfo pi);
	
	// 업체명 검색 
	ArrayList<Ad> selectAdSearchList(PageInfo pi, String keyword);
	
	// 광고 승인대기 리스트 조회용
	ArrayList<Ad> selectAdNewList();
	
	// 광고 등록
	int insertAd(Ad ad);
	
	// 광고 승인 등록 
	int updateStartAd(String adno);
	
	// 광고 마감(종료)
	int updateEndAd(String adno);
	
	// 통계(가입자수)
	Member selectMemberCount();
	
	
}
