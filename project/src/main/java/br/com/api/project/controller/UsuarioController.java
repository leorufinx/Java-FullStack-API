package br.com.api.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@GetMapping("/teste")
	public String teste() {
		return "teste";
	}
}
