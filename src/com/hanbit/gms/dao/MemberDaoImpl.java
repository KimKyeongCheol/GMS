package com.hanbit.gms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hanbit.gms.constant.Database;
import com.hanbit.gms.constant.SQL;
import com.hanbit.gms.constant.Vendor;
import com.hanbit.gms.domain.MemberBean;
import com.hanbit.gms.factory.DatabaseFactory;
public class MemberDaoImpl implements MemberDao{
	public static MemberDaoImpl getInstance() {
		return new MemberDaoImpl();
	}

	private MemberDaoImpl() {
		
	}
	
	@Override
	public String insert(MemberBean member) {
		String rs="";
		try {
			PreparedStatement pstmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_INSERT);
			
					pstmt.setString(1,member.getId());
					pstmt.setString(2, member.getPw());
					pstmt.setString(3, member.getSsn());
					pstmt.setString(4,member.getName());
					rs=String.valueOf(pstmt.executeUpdate());
					System.out.println(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public List<MemberBean> selectAll() {
		List<MemberBean> list=new ArrayList<>();
		
		try {
			MemberBean member=null;
			ResultSet rs=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_LIST).executeQuery();
			while(rs.next()){
				member=new MemberBean();
				member.setId(rs.getString(Database.MEMBER_ID));
				member.setName(rs.getString(Database.MEMBER_NAME));
				member.setPw(rs.getString(Database.MEMBER_PASSWORD));
				member.setRegdate(rs.getString(Database.MEMBER_REGDATE));
				member.setSsn(rs.getString(Database.MEMBER_SSN));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String count() {
		int count=0;
		try {
			ResultSet rs=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_COUNT).executeQuery();
			if(rs.next()){
				count=rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.valueOf(count);
	}

	@Override
	public MemberBean selectById(String id) {
		MemberBean member=new MemberBean();
		try {
			PreparedStatement pstmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_FINDBYID);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				member.setName(rs.getString(Database.MEMBER_NAME));
				member.setId(rs.getString(Database.MEMBER_ID));
				member.setPw(rs.getString(Database.MEMBER_PASSWORD));
				member.setSsn(rs.getString(Database.MEMBER_SSN));
				member.setRegdate(rs.getString(Database.MEMBER_REGDATE));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public List<MemberBean> selectByName(String name) {
List<MemberBean> list=new ArrayList<>();
		
		try {
			MemberBean member=null;
			PreparedStatement pstmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_FINDBYNAME);
			pstmt.setString(1, name);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				member=new MemberBean();
				member.setId(rs.getString(Database.MEMBER_ID));
				member.setName(rs.getString(Database.MEMBER_NAME));
				member.setPw(rs.getString(Database.MEMBER_PASSWORD));
				member.setRegdate(rs.getString(Database.MEMBER_REGDATE));
				member.setSsn(rs.getString(Database.MEMBER_SSN));
				list.add(member);
				System.out.println("회원이름"+member.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String update(MemberBean member) {
		MemberBean temp=selectById(member.getId());
		String id=(member.getId().equals(""))?temp.getId():member.getId();
		String pw=(member.getPw().equals(""))?temp.getPw():member.getPw();
		String rs="";
			try {
				PreparedStatement pstmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
						.getConnection().prepareStatement(SQL.MEMBER_UPDATE);
				pstmt.setString(1, pw);
				pstmt.setString(2, id);
				rs=String.valueOf(pstmt.executeUpdate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("rs"+rs);
		return rs;
	}

	@Override
	public String delete(String id) {
		String rs="";
		try {
			PreparedStatement pstmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME,Database.PASSWORD)
					.getConnection().prepareStatement(SQL.MEMBER_DELETE);
			pstmt.setString(1, id);
			rs=String.valueOf(pstmt.executeUpdate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
