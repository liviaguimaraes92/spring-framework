package com.hello1.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class hello1controller {

	@GetMapping("/hello1")
	
	public String aprendizagem() {
		return "Mentalidade de crescimento\n"
				+"Responsabilidade pessoal\n"
				+"Proatividade";
	}
	
}
