package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class Mydatabase {

	public static Connection Myconnection() {
		Connection con=null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "883039");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static List<Employee> EmployeeRowMapper(ResultSet rs)throws SQLException{
		List<Employee> list= new ArrayList<>();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEId(rs.getInt("EId"));
			e.setEFname(rs.getString("EFname"));
			e.setELname(rs.getString("ELname"));
			e.setEDesignation(rs.getString("EDesignation"));
			e.setEPhone_no(rs.getString("EPhone_no"));
			e.setEAddress(rs.getString("EAddress"));
			e.setESalary(rs.getDouble("ESalary"));
			list.add(e);
		}
		rs.close();
		return list;
	}
	
	
	
	
	
	
}
