package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String Hello () {
		return "Hello World"+ 
				"\nAs habilidades que eu usei foram: Persistência, Orientação ao Futuro e Mentalidade de Crescimento";

	}
}
