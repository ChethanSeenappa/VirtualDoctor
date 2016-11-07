package com.virtualdoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.virtualdoctor.model.User;
import com.virtualdoctor.service.UserService;

@Controller
@EnableWebMvc
public class RegistrationController {
	@Autowired

	public UserService userService;

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {

		if (user.getId() == 0) {
			System.out.println("new user will be created");
			// new person, add it
			this.userService.addUser(user);
		} else {
			// existing person, call update
			this.userService.updateUser(user);
		}

		return "user";
	}

	@RequestMapping("/remove/{id}")
	public String removeUser(@PathVariable("id") int id) {

		// this.userService.removeUser(id);
		return "redirect:/users";

	}

	@RequestMapping("/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", this.userService.getUserById(id));
		model.addAttribute("listUsers", this.userService.listUsers());
		return "user";
	}

}
