package com.springstudy.ch01.main;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springstudy.ch01.domain.Member01;
import com.springstudy.ch01.service.MemberService;

public class MemberBeanIndex {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"classpath:config/MemberBeanContext.xml");
		
		MemberService service = (MemberService) ctx.getBean("memberService");
		
		ArrayList<Member01>memberList = service.getMemberList();
		System.out.println("--- 회원 리스트 ---");
		for(Member01 m : memberList) {
			System.out.println(m);
		}

	}

}
