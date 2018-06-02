package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.Model.EmployeeRegistration;
import com.niit.service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;

	@GetMapping
	public ResponseEntity<List<EmployeeRegistration>> getEmpDetails() {

		return new ResponseEntity<List<EmployeeRegistration>>(empservice.getEmpDetails(), HttpStatus.CREATED);
		
	}
	@GetMapping("/{empId}")
	public ResponseEntity<EmployeeRegistration> getEmployeebyId(@PathVariable("empId") int empId) {
		
		if(empservice.getEmpById(empId)!=null) {
			return new ResponseEntity<EmployeeRegistration>(empservice.getEmpById(empId), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<EmployeeRegistration>(HttpStatus.NOT_FOUND); 
	}
	/*@GetMapping("/{empName}")
	public ResponseEntity<EmployeeRegistration> getEmployeebyName(@PathVariable("empName") String name) {
		
		
			return new ResponseEntity<EmployeeRegistration>(empservice.getEmpByName(name), HttpStatus.OK);
		
	}*/
	@DeleteMapping("/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") int empId) {
		
		if(empservice.getEmpById(empId)!=null) {
			empservice.deleteEmp(empId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
	}
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody EmployeeRegistration employee) {
		
		
			empservice.addEmp(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
		@PutMapping
		public ResponseEntity<Void> updateEmployee(@RequestBody EmployeeRegistration employee) {
			
			if(empservice.getEmpById(employee.getEmpId())!=null) {
				empservice.updateEmp(employee);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else {
				
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		
		

	}
	



}
