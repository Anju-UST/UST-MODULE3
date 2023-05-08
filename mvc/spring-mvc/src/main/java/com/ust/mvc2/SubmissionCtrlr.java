package com.ust.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/submission")
public class SubmissionCtrlr {
	@PostMapping
	public String signin(
			@RequestParam("job") String job,
			@RequestParam("mailid") String mailid, Model model) {
		model.addAttribute("job", job);
		if(mailid.length()>6) {
			model.addAttribute("mailid", mailid);
		}
		return "success";
	}
			
	

}
