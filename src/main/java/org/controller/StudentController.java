package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController
{
	@RequestMapping("/register")
	@ResponseBody
	public String register()
	{
		return "Register student";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login()
	{
		return "Student login";
	}
}
