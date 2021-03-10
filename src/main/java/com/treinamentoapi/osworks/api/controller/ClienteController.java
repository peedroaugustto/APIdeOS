package com.treinamentoapi.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentoapi.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro");
		cliente1.setEmail("pedro@pedro.com.br");
		cliente1.setTelefone("34 9 9999-9999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Joaoo");
		cliente2.setEmail("joao@joao.com.br");
		cliente2.setTelefone("34 9 9999-9999");
		
		return Arrays.asList(cliente1,cliente2);
	}
}
