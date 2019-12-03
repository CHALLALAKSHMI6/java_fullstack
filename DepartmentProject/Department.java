package com.hcl.Department;

public class Department {
	private int Deptno;
	 private String dname;
	 private String dloc;
	 private String city;
	 private String head;
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	 
}