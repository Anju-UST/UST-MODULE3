package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String respond(Model model) {
		return "registration";//view   displays 
		//thymeleaf is view technology
		
	}
}
