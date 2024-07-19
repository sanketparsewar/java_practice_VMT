package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class StudentDao2 {
	public int insertStudent(Student student) {
		int check = 0;
		String sql = "insert into student(Sid,sname, scity, Sphone) values (?,?,?,?)";
		try (
				// resource block
				Connection connection = MyDatabase.myConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.setString(2, student.getSname());
			preparedStatement.setString(3, student.getScity());
			preparedStatement.setString(4, student.getSphone());
			check = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}


	public int deleteStudent(int Sid) {

		int check = 0;
		String sql = "delete from student where Sid=?";

		try (Connection connection = MyDatabase.myConnection();
				PreparedStatement prepareStatement = connection.prepareStatement(sql)) {
			prepareStatement.setInt(1, Sid);
			check = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
		
	
}



