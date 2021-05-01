package com.tyss.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping(path = "/first", method = RequestMethod.GET)
	public ModelAndView getFirtPage() {
		ModelAndView andview = new ModelAndView();
		andview.addObject("name", "pradeep");
	//	andview.setViewName("/WEB-INF/views/app.jsp");
		return andview;
	}

	
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public ModelAndView getUserData(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/user.jsp");
		modelAndView.setViewName("user");

		return modelAndView;
	}
	
	
@GetMapping("/second")
	public String getUser(ModelMap map) {
		map.addAttribute("name", "Smith");
		return "app";
	}
	
	
	
	
	
	
}
