package ua.taraslviv.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.taraslviv.model.Customer;
import ua.taraslviv.service.CustomerService;

@Controller
public class HomeController {

	@Inject
	CustomerService customerService;
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		
		model.addAttribute("messageOk", "Alright!");
		
		return "index";
	}

	@RequestMapping(value = {"/users"}, method = RequestMethod.GET)
	public String users(Model model) {
		
		Customer customer = customerService.getCustomerById(1L);
		
		model.addAttribute("customer_email", customer.getEmail());
		model.addAttribute("customer_password", customer.getPassword());

		return "index";
	}
	
	@RequestMapping(value = {"/fail"}, method = RequestMethod.GET)
	public String userFail(Model model) {
		
		model.addAttribute("message", "asses is denied");

		return "index";
	}

}
