package com.springstudy.ch01.domain;

import java.sql.Timestamp;
import java.util.Calendar;

public class Member01 {
	private String name;
	private String id;
	private String pass;
	private Timestamp birthDay;
	private String gender;
	private String postNum;
	private String address1;
	private String address2;
	
	public Member01() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Timestamp getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Timestamp birthDay) {
		this.birthDay = birthDay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPostNum() {
		return postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Override
	public String toString() {
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(getBirthDay().getTime());
		
		String birthDay = cal.get(Calendar.YEAR) + "년 " 
				+ (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DAY_OF_MONTH) + "일";
		
		return name + "(" + id + ") : " + birthDay + ", " + gender
				+ "( 주소 : " + postNum + " " + address1 + " )"; 
	}

}
