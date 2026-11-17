package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/students")
public class StudentHttpMethodController
{
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public String getStudents()
	{
		return "Fetching All Students";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerStudent()
	{
		return "Student Registered Successfully";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	public String updateSTudent()
	{
		return "Student Updated Successfully";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent()
	{
		return "Student Deleted Successfully";
	}
}
