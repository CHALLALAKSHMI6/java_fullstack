package com.hcl.Department;

import java.util.Scanner;

import com.hcl.Department.DepartmentDAO;

public class DeleteDept {
	public static void main(String[] args) {
		int deptno;
		System.out.println("Enter department No");
		Scanner sc=new Scanner(System.in);
		deptno=sc.nextInt();
		DepartmentDAO dao=new DepartmentDAO();
		System.out.println(dao.deleteDepartment(deptno));
	}

}
