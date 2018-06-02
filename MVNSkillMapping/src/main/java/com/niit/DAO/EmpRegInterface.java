package com.niit.DAO;

import java.util.List;

import com.niit.Model.EmployeeRegistration;


public interface EmpRegInterface 
{
	boolean addEmp(EmployeeRegistration emp);

	boolean updateEmp(EmployeeRegistration emp);

	boolean deleteEmp(int Id);

	List<EmployeeRegistration> getEmpDetails();

	EmployeeRegistration getEmpById(int Id);

	EmployeeRegistration getEmpByName(String name);


	
}
