package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.niit.Model.EmployeeRegistration;
import com.niit.service.*;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	/*
	@GetMapping("/")
	public String hello() {
	
		return "index";
	}*/
	
	
	@GetMapping("/")
	public String listEmployees(Model model) {
		model.addAttribute("employee",new EmployeeRegistration());
		model.addAttribute("employees",employeeService.getEmpDetails());
		
		return "Employee";
	}
	
	@PostMapping("/employee/add")
	public String addEmployee(@ModelAttribute("employee") EmployeeRegistration employee) {
		
		if(employee.getEmpId()==0) {
			employeeService.addEmp(employee);
		}
		else {
			employeeService.updateEmp(employee);
		}
		
		return "redirect:/";
	}
	
	@GetMapping("/remove/{id}")
	public String removeEmployee(@PathVariable("id") int id){
		
		System.out.println("inside remove method");
		employeeService.deleteEmp(id);
        return "redirect:/";
    }
 
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){
        model.addAttribute("employee", employeeService.getEmpById(id));
        model.addAttribute("employees",employeeService.getEmpDetails());
        return "Employee";
    }
	
}
         