package com.kh.styleblending.main.model.service;

import java.util.ArrayList;

import com.kh.styleblending.admin.model.vo.Ad;
import com.kh.styleblending.posting.model.vo.Posting;

public interface MainService {
	
	//메인 상단 좋아요 순 4개 사진
	ArrayList<Posting> selectFourWrap();
	//메인 나머지 리스트 최신순
	ArrayList<Posting> selectPostList();
	//메인 무한스크롤 리스트
	ArrayList<Posting> selectInfinityScroll();
	//광고 url/ 사진 가져옫기
	Ad selectAd();
}
