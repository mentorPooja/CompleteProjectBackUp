package com.niit.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name="EmployeeRegister")
public class EmployeeRegistration
{
	@Id
    int    empId;
	@NonNull
    String  empName;
	@NonNull
    String  empEmail;
	@NonNull
    String   empMobile;
	@NonNull
    String  empGender;
	@NonNull
    String  empAddress;;
	@NonNull
    String  empCity;
	@NonNull
    String  empNationality;
	@NonNull
    String  empDob;
	@NonNull
    String  empRole;
	@NonNull
    String empPassword;
	@NonNull
    String empStatus;
	@NonNull
    String IBUName;
	@NonNull
    int supervisorId;
	@NonNull
    String supervisorName;
	@NonNull
    String supervisorContact;
   
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpNationality() {
		return empNationality;
	}
	public void setEmpNationality(String empNationality) {
		this.empNationality = empNationality;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public String getIBUName() {
		return IBUName;
	}
	public void setIBUName(String iBUName) {
		IBUName = iBUName;
	}
	public int getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public String getSupervisorContact() {
		return supervisorContact;
	}
	public void setSupervisorContact(String supervisorContact) {
		this.supervisorContact = supervisorContact;
	}
	

	@Override
	public String toString() {
		return "EmployeeRegistration [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmail
				+ ", empPassword=" + empPassword+",IBUName = "+IBUName + ", Emprole=" + empRole +", empStatus= "+empStatus+",Supervisor ID = "+supervisorId+", SupervisorName = "+supervisorName
				+",EmpAddr = "+empAddress+",EmpCity = "+empCity+",EmpDOB = "+empDob+",empGender = "+empGender
				+"SupervisorCOntact = "+supervisorContact+",EmpNationality = "+empNationality +"]";

	}

}
