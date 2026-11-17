package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentmappingController
{
	@GetMapping("/students")
	@ResponseBody
	public String getStudents()
	{
		return "Fetching All Students";
	}
	
	@PostMapping("/students")
	@ResponseBody
	public String registerStudent()
	{
		return "Student Registered Successfully";
	}
	
	@PutMapping("/students")
	@ResponseBody
	public String updateSTudent()
	{
		return "Student Updated Successfully";
	}
	
	@PatchMapping("/students")
	@ResponseBody
    public String partiallyUpdateStudent() {

        return "Student partially updated successfully";
    }
	
	@DeleteMapping("/students")
	@ResponseBody
	public String deleteStudent()
	{
		return "Student Deleted Successfully";
	}
}
