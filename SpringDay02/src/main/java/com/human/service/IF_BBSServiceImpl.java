package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_BBSDAO;
import com.human.VO.BBSVO;
@Service
public class IF_BBSServiceImpl implements IF_BBSService {
	@Inject
	private IF_BBSDAO bbsdao;
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		// 실제 데이터베이스 작업 등 서비스 로직을 실행한다
		bbsdao.insert(bbsvo);
	}
	@Override
	public List<BBSVO> bbsList() throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.selectAll();
	}

}
