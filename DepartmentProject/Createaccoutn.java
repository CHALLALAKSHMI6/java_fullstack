package com.hcl.Department;

import java.util.Scanner;

import com.hcl.Department.Department;
import com.hcl.Department.DepartmentDAO;

public class Createaccoutn {
public static void main(String[] args) {
		
	DepartmentDAO dao=new DepartmentDAO();
	Department department=new Department();
		int deptno=dao.generateDeptno();
		department.setDeptno(deptno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  department Name");
		department.setDname(sc.nextLine());
		System.out.println("Enter Department local");
		department.setDloc(sc.nextLine());
		System.out.println("enter city");
		department.setCity(sc.nextLine());
		System.out.println("Enter head");
		department.setHead(sc.nextLine());
		System.out.println(dao.addDepartment(department));
	}

}
