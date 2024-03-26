package br.com.treinamento.projeto1.controller;

import br.com.treinamento.projeto1.model.Cliente;
import br.com.treinamento.projeto1.repository.ClienteRepository;

public class ClienteController {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteController() {
		super();
		this.clienteRepository = new ClienteRepository();
	}

	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.cadastrar(cliente);
	}

	public Cliente buscarPeloId(int id) {
		return clienteRepository.buscarPeloId(id);
	}
	
	public Cliente buscarPeloCodigoCliente(int codigoCliente) {
		return clienteRepository.buscarPeloCodigoCliente(codigoCliente);
	}
	
}
