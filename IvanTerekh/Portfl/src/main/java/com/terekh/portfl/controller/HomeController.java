package com.terekh.portfl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.terekh.portfl.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("user", userService.findOne(1L));
		
		return "home";
	}
	
}
