package com.ust.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {
	@GetMapping
	public String message(Model model) {
		model.addAttribute("myName","Anju");
		return "submit";
	}

}
