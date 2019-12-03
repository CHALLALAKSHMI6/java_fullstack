package com.hcl.Department;

import java.util.Scanner;

import com.hcl.Department.Department;
import com.hcl.Department.DepartmentDAO;

public class SearchDepartmentMain {

	public static void main(String[] args) {
		int Deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dept no");
		Deptno=sc.nextInt();
		DepartmentDAO dao=new DepartmentDAO();
		Department department=dao.searchDepartment(Deptno);
		if(department!=null){
			System.out.println("name"+department.getDname());
			System.out.println("department"+department.getDloc());
		
			
		}else{
			System.out.println("record not found");
			
		}
	}
}
