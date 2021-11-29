package com.human.service;

import java.util.List;

import com.human.VO.BBSVO;

public interface IF_BBSService {
	// 컨트롤러가 서비스단을 호출하기 위한 메서드를 정의한 것, throws Exception은 예외가 발생하는 처리해 달라!라는 의미
	public void insert(BBSVO bbsvo) throws Exception;
	public List<BBSVO> bbsList() throws Exception;
}
