package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	@ResponseBody
	public String home()
	{
		return "Welcome to my First Spring MVC Project";
	}
	
	
	@RequestMapping("/about")
	@ResponseBody
	public String about()
	{
		return "This is About Page";
	}

}
