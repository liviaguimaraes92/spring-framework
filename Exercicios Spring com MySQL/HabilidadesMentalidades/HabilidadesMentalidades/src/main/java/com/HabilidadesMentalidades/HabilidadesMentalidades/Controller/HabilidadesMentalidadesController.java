package com.HabilidadesMentalidades.HabilidadesMentalidades.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HabilidadesMentalidadesController {

	@GetMapping("/habilidades-mentalidades")
	
	public String habilidadementalidade() {
		return "Teoria técnica\n"
				+ "Prática técnica\n"
				+ "Aplicação de Habilidades\n"
				+ "Empregabilidade\n"
				+ "Gerando comunidade\n"
				+ "Suporte social\n"
				+ "Reflexões\n"
				+ "Projeto integrador\n"
				+ "Tempo flexivel";
	}
}
