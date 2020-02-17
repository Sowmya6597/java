package com.cts.training.controller;
import java.security.Principal;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	
    @RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("name", "Home Page");
		model.addAttribute("description", "unsecured page !");
		return "home";
	}

	@RequestMapping(value ="/admin", method=RequestMethod.GET)
	public String admin(Model model, Principal principal) {
		String loggedInUserName = principal.getName();
		model.addAttribute("user", loggedInUserName);
		model.addAttribute("name", "Spring Security");
		model.addAttribute("description", "Page is Protected");
		return "admin";
	}
	@RequestMapping(value ="/login", method=RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(ModelMap model) {
		model.addAttribute("message", "Successfully loggedout...");
		return "logout";
	}
	@RequestMapping(value="/loginError", method=RequestMethod.GET)
	public String loginError(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";
	}
	@RequestMapping(value="/accessDenied",method =RequestMethod.GET)
	public ModelAndView accessDenied(Principal user)
	{
		ModelAndView model=new ModelAndView();
		if(user != null) {
			model.addObject("msg","Hi" +user.getName()+ ",You donot have permission to accesss this page!");
		}
		else
		{
			model.addObject("msg","You donot have permission to access this page!");
		}
		model.setViewName("accessdenied");
		return model;
	}
	
}

