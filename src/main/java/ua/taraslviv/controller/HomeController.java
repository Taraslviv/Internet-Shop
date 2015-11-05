package ua.taraslviv.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.taraslviv.model.Customer;
import ua.taraslviv.model.Stuff;
import ua.taraslviv.service.CustomerService;
import ua.taraslviv.service.StuffService;

@Controller
public class HomeController {

	@Inject
	CustomerService customerService;

	@Inject
	StuffService stuffService;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String homePage(Model model, Principal principal) {
		List<Stuff> allStuff = new ArrayList();
		allStuff = stuffService.getAllStuff();

		
		model.addAttribute("all_stuff", allStuff);
		if (principal != null)
			model.addAttribute("customer_name", customerService.getCustomerByEmail(principal.getName()).getFirstName());

		return "index";
	}

	@RequestMapping(value = { "/fail" }, method = RequestMethod.GET)
	public String userFail(Model model) {

		return "index";
	}

}
