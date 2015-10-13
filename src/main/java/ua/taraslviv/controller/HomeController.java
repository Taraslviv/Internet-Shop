package ua.taraslviv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		
		model.addAttribute("messageOk", "Alright!");
		
		return "index";
	}

	@RequestMapping(value = {"/users"}, method = RequestMethod.GET)
	public String users(Model model) {
		
		model.addAttribute("messageFromUser", "USERS! secutity is working");
		
		return "index";
	}

}
