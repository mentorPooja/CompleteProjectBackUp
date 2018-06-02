package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.niit.DAO.EmpRegInterface;
//import com.niit.DAO.EmployeeDAO;
import com.niit.Model.EmployeeRegistration;

@Component
@Service
public class EmpServiceImp implements EmployeeService {

	@Autowired
	private EmpRegInterface empDao;

	public boolean addEmp(EmployeeRegistration emp) {
		if (empDao.getEmpById(emp.getEmpId()) != null) {
			return false;
		} else {
			empDao.addEmp(emp);
			return true;
		}
	}

	public boolean updateEmp(EmployeeRegistration emp) {
		return empDao.updateEmp(emp);
		
		/*if(empDao.getEmpById(emp.getEmpId())!=null) {	
			empDao.updateEmp(emp);
			return true;
		}
		else {
			return false;
		}*/
		


	}

	public boolean deleteEmp(int Id) {
		if(empDao.getEmpById(Id)!=null) {	
			empDao.deleteEmp(Id);
			return true;
		}
		else {
			return false;
		}

	}

	public List<EmployeeRegistration> getEmpDetails() {
		return empDao.getEmpDetails();

	}

	public EmployeeRegistration getEmpById(int Id) {
		return empDao.getEmpById(Id);

	}

	public EmployeeRegistration getEmpByName(String name) {
		return empDao.getEmpByName(name);

	}

}
