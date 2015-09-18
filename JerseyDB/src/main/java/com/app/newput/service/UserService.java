package com.app.newput.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.app.newput.bean.UserBean;
import com.app.newput.connection.DBConnection;

public class UserService {

	DBConnection dbConnection = new DBConnection();
			
	public UserBean registerUser_1(UserBean bean){
		String sql = "insert into test(name, address, mobile) values (?, ?, ?)";
		String sql1 = "select max(id) from test";
		Connection con = dbConnection.getConnection();
		PreparedStatement ps = null;
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getAddress());
			ps.setInt(3, bean.getMobile());
			ps.executeUpdate();
			
			ps = con.prepareStatement(sql1);
			ResultSet rs = ps.executeQuery(sql1);
			if(rs.next()){
				bean.setMaxId(rs.getInt(1));
			}			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbConnection.closeConnection();
		}		
		return bean;
	}
	
	public UserBean registerUser_2(UserBean bean){
		Connection con = dbConnection.getConnection();
		PreparedStatement ps = null;
		
		String sql1 = "select count from test_2";
		String sql2 = "update test_2 set count = ? where table_name = ?";		
		String sql3 = "insert into test_1(id, name, address, mobile) values (?, ?, ?, ?)";		
		
		
		try{
			ps = con.prepareStatement(sql1);
			ResultSet rs = ps.executeQuery(sql1);
			if(rs.next()){
				bean.setId(rs.getInt(1));				
			}
			
			ps = con.prepareStatement(sql2);
			ps.setInt(1, (bean.getId()+1));
			ps.setString(2, "test_1");
			ps.executeUpdate();	
			
			
			ps = con.prepareStatement(sql3);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getAddress());
			ps.setInt(4, bean.getMobile());
			ps.executeUpdate();
									
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbConnection.closeConnection();
		}		
		return bean;
	}
}
