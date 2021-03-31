package com.springstudy.ch01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springstudy.ch01.domain.Member01;

public class MemberDaoImpl implements MemberDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DriverManagerDataSource dataSource;
	
	public MemberDaoImpl(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public ArrayList<Member01> getMemberList() {
		
		String selectAllMember = "SELECT * FROM member01;";
		ArrayList<Member01> memberList = null;
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(selectAllMember);
			rs = pstmt.executeQuery();
			
			memberList = new ArrayList<Member01>();
			
			while(rs.next()) {
				
				Member01 member = new Member01();
				member.setName(rs.getString("name"));
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
				member.setBirthDay(rs.getTimestamp("birthday"));
				member.setGender(rs.getString("gender"));
				member.setPostNum(rs.getString("postnum"));
				member.setAddress1(rs.getString("address1"));
				member.setAddress2(rs.getString("address2"));
				
				memberList.add(member);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				
			}
		}
		
		return memberList;
	}

}
