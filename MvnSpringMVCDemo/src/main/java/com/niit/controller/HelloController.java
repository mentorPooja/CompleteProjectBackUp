package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.niit.domain.HelloWorld;

@Controller
public class HelloController {

	@Autowired
	private HelloWorld helloWorld;
	
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("hello", helloWorld.sayHello());
		return "disp";
	}
	
}