package com.tplassaad.tplassaad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class orchestrateur {
	
	@GetMapping(path="/")
	public String index() {
		return "index";
	}
	
//	@GetMapping(path="/returnedPage")
//	public String returnedPage() {
//		return "returnedPage";
//	}
	
	@PostMapping(path="/Bonjour")
	public String ironie(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		System.out.println("name =======" + name);
		return "returnedPage";
	}

}
