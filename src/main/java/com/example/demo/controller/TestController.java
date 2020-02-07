package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Human;
import com.example.demo.service.HumanService;

@Controller
public class TestController {
	
	@Autowired
	private HumanService humanService;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("name", humanService.getHuman().getName());
		return "welcome";
	}
	
	@RequestMapping("/create-human")
	public String createHuman(Model model) {
		model.addAttribute("human", new Human());
		return "createHuman";
	}
	
	@RequestMapping(value = "/add-human",
					method = RequestMethod.POST)
	public String addHuman(@ModelAttribute Human human) {
		humanService.setHuman(human);
		return "redirect:/";
	}
}
