package com.hcl.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hcl.Department.DaoConnection;
import com.hcl.Department.Department;
import com.hcl.Department.Department;
import com.hcl.Department.Department;
import com.hcl.Department.Department;

public class DepartmentDAO {
	
	Connection connection;
	PreparedStatement pst;
	public String deleteDepartment(int deptno){
		connection=DaoConnection.getConnection();
		Department department=searchDepartment(deptno);
		String result="";
		if(department!=null){
			String cmd="Delete from Department where Deptno=?";
			try {
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, deptno);
				pst.executeUpdate();
				result="Record Deleted";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="Record not found";
		}
		return result;
	}
	public Department searchDepartment(int Deptno){
		connection=DaoConnection.getConnection();
		String cmd="select *from Department where Deptno=?";
		Department department=null;
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,Deptno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				department=new Department();
				department.setDeptno(rs.getInt("Deptno"));
				department.setDname(rs.getString("Dname"));
				department.setDloc(rs.getString("Loc"));
				department.setCity(rs.getString("City"));
				department.setHead(rs.getString("Head"));
			
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return department;
	}
	public String addDepartment(Department department){
		connection =DaoConnection.getConnection();
		String cmd=" insert into Department(Deptno,Dname,loc,City,Head) "
				+ " values(?,?,?,?,?)  ";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, department.getDeptno());
			pst.setString(2, department.getDname());
			pst.setString(3, department.getDloc());
			pst.setString(4, department.getCity());
			pst.setString(5,department.getHead());
			pst.executeUpdate();
			result="Department Record Added...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int generateDeptno(){
		
		
		 connection=DaoConnection.getConnection();
		String cmd=" select case when max(Deptno) is null then 1 " 
				+ " else max(Deptno) +1 end Deptno from Department " ;
		int Deptno=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			Deptno=rs.getInt("Deptno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Deptno;
		
		
				
		}


public List<Department> showDepartment(){
	 connection=DaoConnection.getConnection();
	 String cmd="select *from Department";
	 Department department=null;
	 List<Department> departmentList=new ArrayList<>();
	 try {
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			department=new Department();
			department.setDeptno(rs.getInt("Deptno"));
			department.setDname(rs.getString("Dname"));
			department.setDloc(rs.getString("Loc"));
			department.setCity(rs.getString("City"));
			department.setHead(rs.getString("Head"));
			departmentList.add(department);
			
			
		}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return departmentList;
}
}
		