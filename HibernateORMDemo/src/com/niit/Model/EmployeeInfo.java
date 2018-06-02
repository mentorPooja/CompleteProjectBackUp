package com.niit.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyEmployee")
public class EmployeeInfo {
	@Id 
	private int    empId;
	private String empname;
	public EmployeeInfo() {
	}
	public EmployeeInfo(String name, int roll_no) {
		this.empname    = name;
		this.empId = roll_no;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int roll_no) {
		this.empId = roll_no;
	}

	public String getEmpName() {
		return empname;
	}

	public void setEmpName(String name) {
		this.empname = name;
	}
}
