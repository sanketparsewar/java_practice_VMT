package com.dao;

import com.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
//	insert data into student table 
	public int insertStudent(Student s) {
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // step1 load driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "883039"); // step2 create
																										// connection
			String sql = "insert into student(sid,sname,scity,sPhone) values(?,?,?,?)"; // step3 write query
			pst = con.prepareStatement(sql); // step4 create Statement
			pst.setInt(1, s.getSid());
			pst.setString(2, s.getSname());
			pst.setString(3, s.getScity());
			pst.setString(4, s.getSphone());
			check = pst.executeUpdate(); // step5 execute Statement

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		finally {
			try {
				pst.close(); // step6 close connection
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return check;
	}

//	Delete record from the student table

	public int deleteStudentBySid(int Sid) {

		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "883039");
			String sql = "Delete from student Where sid=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, Sid);
			check = pst.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return check;
	}

//	Print record of a student from student table through Sid

	public Student findStudentBySid(int Sid) {

		Student s = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "883039");
			String sql = "Select sid,sname,scity,sphone from student where sid=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, Sid);
			rs = pst.executeQuery(); // when we try DQL query we have to use ResultSet as DQL is use to display
			while (rs.next()) {
				s = new Student();
				s.setSid(rs.getInt("Sid"));
				s.setSname(rs.getString("Sname"));
				s.setScity(rs.getString("Scity"));
				s.setSphone(rs.getString("Sphone"));
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return s;
	}

//	Find ALL students from student table
	public List<Student> findAllStudent() {
		List<Student> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mys" + "ql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "883039");
			String sql = "select Sid,Sname,Scity,Sphone from student";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setSid(rs.getInt("Sid"));
				s.setSname(rs.getString("Sname"));
				s.setScity(rs.getString("Scity"));
				s.setSphone(rs.getString("Sphone"));
				list.add(s);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return list;
	}

//	Update record through Sid in student table

	public int updateStudent(Student s) {
		int check = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "883039");
			String sql = "Update student set Sname=?,Scity=?,Sphone=? where Sid=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getSname());
			pst.setString(2, s.getScity());
			pst.setString(3, s.getSphone());
			pst.setInt(4, s.getSid());
			check = pst.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return check;
	}

}
