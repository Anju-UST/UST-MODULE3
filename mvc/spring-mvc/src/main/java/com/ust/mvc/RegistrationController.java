package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	
	@PostMapping
	public String signup(
			@RequestParam("userName") String userName,
			@RequestParam("mailid") String mailid, Model model) {
	
		if(userName.length()>6 && mailid.length()>6) {
			model.addAttribute("userName",userName);
			model.addAttribute("mailid",mailid);
			return "success";
		}
		else {
			return "error";
		}
	}
		//layer between java and html is mvc controller
}
