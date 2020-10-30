package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class ObjetivosController {
	
	@RequestMapping("/Objetivos")

	@GetMapping
	public String Objetivos () {
		return "Desejo melhorar a minha Responsabilidade Pessoal, e dominar melhor o Spring";

	}

}
