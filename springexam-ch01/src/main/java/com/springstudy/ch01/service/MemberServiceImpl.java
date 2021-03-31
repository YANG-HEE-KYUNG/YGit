package com.springstudy.ch01.service;

import java.util.ArrayList;

import com.springstudy.ch01.dao.MemberDao;
import com.springstudy.ch01.domain.Member01;

public class MemberServiceImpl implements MemberService {
	
	private MemberDao memberDao;
	
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public ArrayList<Member01> getMemberList() {
		return memberDao.getMemberList();
	}

}
