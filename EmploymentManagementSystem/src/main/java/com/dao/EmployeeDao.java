package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Employee;
import com.util.Mydatabase;

public class EmployeeDao {

	public int insertEmployee(Employee e) {
		int check = 0;
		String sql = "insert into Employee(EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary )values (?,?,?,?,?,?)";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql);) {

			pst.setString(1, e.getEFname());
			pst.setString(2, e.getELname());
			pst.setString(3, e.getEDesignation());
			pst.setString(4, e.getEPhone_no());
			pst.setString(5, e.getEAddress());
			pst.setDouble(6, e.getESalary());
			check = pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return check;
	}

	public int deleteEmployeeByEId(int EId) {
		int check = 0;
		String sql = "delete from Employee where EId=?";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, EId);
			check = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return check;
	}

	public Employee findEmployeeByEid(int EId) {
		Employee e = null;
		String sql = "select EId,EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary from Employee where EId=? ";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, EId);
			ResultSet rs = pst.executeQuery();
			List<Employee> list = Mydatabase.EmployeeRowMapper(rs);
			if (!list.isEmpty())
				e = list.get(0);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> list = new ArrayList<>();
		String sql = "select Eid,EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary from Employee";
		try (Connection con = Mydatabase.Myconnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			list = Mydatabase.EmployeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public int updateEmployeeByEid(Employee e) {
		int check = 0;
		String sql = "Update Employee set EFname=?,ELname=?,EDesignation=?,EPhone_no=?,EAddress=?,ESalary=? where EId=?";

		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setString(1, e.getEFname());
			pst.setString(2, e.getELname());
			pst.setString(3, e.getEDesignation());
			pst.setString(4, e.getEPhone_no());
			pst.setString(5, e.getEAddress());
			pst.setDouble(6, e.getESalary());
			pst.setInt(7, e.getEId());
			check = pst.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();

		}
		return check;
	}

	public List<Employee> findEployeeByEFname(String EFname) {
		List<Employee> list = new ArrayList<>();

		String sql = "select EId,EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary from Employee where EFname=? ";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, EFname);
			ResultSet rs = pst.executeQuery();
			list = Mydatabase.EmployeeRowMapper(rs);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return list;
	}

	public List<Employee> findEmployeeByEFnameAndEDesignation(String EFname, String EDesignation) {
		List<Employee> list = new ArrayList<>();
		String sql = "Select EId,EFname,ELname,EDesignation ,EPhone_no,EAddress,ESalary from Employee where EFname=? and EDesignation=?";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, EFname);
			pst.setString(2, EDesignation);
			ResultSet rs = pst.executeQuery();
			list = Mydatabase.EmployeeRowMapper(rs);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return list;
	}

	public List<Employee> findEmployeeByEFnameOrEDesignation(String EFname, String EDesignation) {
		List<Employee> list = new ArrayList<>();
		String sql = "Select EId,EFname,ELname,EDesignation, EPhone_no,EAddress, ESalary from Employee where EFname=? or EDesignation=?";

		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, EFname);
			pst.setString(2, EDesignation);
			ResultSet rs = pst.executeQuery();
			list = Mydatabase.EmployeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Employee> findEmployeeBySalaryLessThan(double ESalary) {
		List<Employee> list = new ArrayList<>();
		String sql = "Select EId,EFname,ELname,EDesignation,Ephone_no,EAddress,ESalary from Employee where ESalary<?";
		try (Connection con = Mydatabase.Myconnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setDouble(1, ESalary);
			ResultSet rs=pst.executeQuery();
			list=Mydatabase.EmployeeRowMapper(rs);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return list;
	}
	
	
	public List<Employee> findEmployeeBySalaryGreaterThan(double ESalary) {
		List<Employee> list = new ArrayList<>();
			
		String sql="Select EId,EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary from Employee where ESalary>?";
		try (Connection con =Mydatabase.Myconnection();
				PreparedStatement pst = con.prepareStatement(sql)){
			pst.setDouble(1, ESalary);
			ResultSet rs=pst.executeQuery();
			list=Mydatabase.EmployeeRowMapper(rs);
		}
		catch (SQLException e1) {e1.printStackTrace();}
		return list;
	}
	
	
	public List<Employee> findEmployeeBySalaryEqualTo(double ESalary)
	{
		List<Employee> list = new ArrayList<>();
		String sql="Select EId,EFname,ELname,EDesignation,EPhone_no,EAddress,ESalary from Employee where ESalary=?";
		try(Connection con = Mydatabase.Myconnection();
				PreparedStatement pst=con.prepareStatement(sql)){
			pst.setDouble(1, ESalary);
			ResultSet rs=pst.executeQuery();
			list=Mydatabase.EmployeeRowMapper(rs);
		}
		catch(SQLException e1) {e1.printStackTrace();}
				
		return list;
	}
	
	public List<Employee> findEmployeeBySalaryBetween(double low, double high)
	{
		List<Employee> list = new ArrayList<>();
		
		String sql="Select EId, EFname,ELname,EDesignation ,EPhone_no,EAddress,ESalary from EMployee where ESalary between ? and ?";
		try (Connection con = Mydatabase.Myconnection();
				PreparedStatement pst= con.prepareStatement(sql)){
			pst.setDouble(1, low);
			pst.setDouble(2, high);;
			ResultSet rs=pst.executeQuery();
			list=Mydatabase.EmployeeRowMapper(rs);
		}
		catch (SQLException e1) {e1.printStackTrace();}
		
		return list;
	}
	
	
	public List<Employee> findEmployeeByEFnameLike(String Efname){
		
		List<Employee> list = new ArrayList<>();
		
		try (PreparedStatement ptmt = Mydatabase.Myconnection().prepareStatement("select * from Employee where EFname like ?")){
			ptmt.setString(1, Efname+"%");
			ResultSet rs=ptmt.executeQuery();
			list=Mydatabase.EmployeeRowMapper(rs);
		}
		catch (SQLException e1){e1.printStackTrace();}
		
		return list;
	}
	
	public List<Employee> findEmployeeByEIdIn(List<Integer> id)
	{
		List<Employee> list=new ArrayList<>();
		StringBuilder sql=new StringBuilder ("select * from Employee where EId in (");
		for(int i=0;i<id.size()-1;i++)
			sql.append(id.get(i)).append(",");
		sql.append(id.get(id.size()-1)).append(")");
		try (ResultSet rs = Mydatabase.Myconnection().prepareStatement(sql.toString()).executeQuery()){
			list = Mydatabase.EmployeeRowMapper(rs);
			
		}
		catch (SQLException e1) {e1.printStackTrace();}
		
		return list;
	}
	
//	public List<Employee> findEmployeeByAny(String anyValue){
//		List<Employee> list= new ArrayList<>();
//		String sql= "select * from employee where EFname like ? or ELname like ? or EDesignation like ? or EPhone_no like ? or EAddress like ?";
//		
//		
//		try (PreparedStatement ptmt=Mydatabase.Myconnection().prepareStatement(sql)){
//			ptmt.setString(1, "'%"+anyValue+"%'");
//			ptmt.setString(2, "'%"+anyValue+"%'");
//			ptmt.setString(3, "'%"+anyValue+"%'");
//			ptmt.setString(4, "'%"+anyValue+"%'");
//			ptmt.setString(5, "'%"+anyValue+"%'");
//			ResultSet rs=ptmt.executeQuery();
//		}
//		cathc(SQLException e1){e1.printStackTrace();}
//		
//		return list;
//	}
	
	public Map<String ,List> findEFnameAndESalary()
	{
		Map<String,List> m= new HashMap<>();
		String sql="Select EFname ,ESalary from Employee";
		
		try (PreparedStatement ptmt=Mydatabase.Myconnection().prepareStatement(sql);){
			ResultSet rs= ptmt.executeQuery();
			List<String> listOfEFnames = new ArrayList<>();
			List<Double> listOFESalary = new ArrayList<>();
			while(rs.next()) {
				listOfEFnames.add(rs.getString("EFname"));
				listOFESalary.add(rs.getDouble("ESalary"));
			}
			m.put("listOfEFnames", listOfEFnames);
			m.put("listOFESalary", listOFESalary);
			
		}
		catch(SQLException e1){e1.printStackTrace();}
		
		return m;  
		
	}
	

	

}
