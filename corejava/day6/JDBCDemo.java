package com.htc.corejava.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JDBCDemo {
	
	public static void insertPolicy() {

		Connection con = null;
		try {
			
			DriverManager.registerDriver(new org.postgresql.Driver());
			con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","openpg", "openpgpwd" );
			PreparedStatement pst = con.prepareStatement("insert into policy values(?,?,?,?)");
			pst.setInt(1, 4959949);
			pst.setString(2, "Anish");
			pst.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
			pst.setDouble(4, 450.0);
			
			int result =  pst.executeUpdate();
			
			System.out.println("Recod inserted: " + result);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		
		insertPolicy();
		
		Connection con = null;
		try {
			
			DriverManager.registerDriver(new org.postgresql.Driver());
			con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","openpg", "openpgpwd" );
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select policyno, policyholdername, issuedate, premium from policy");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getDate(3) + "," + rs.getDouble(4));
		    }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
