package br.com.treinamento.projeto1.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.treinamento.projeto1.model.Cliente;

public class ClienteRepository {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public Cliente cadastrar(Cliente cliente) {
		cliente.setId(clientes.size()+1);
		clientes.add(cliente);
		return cliente;
	}

	public Cliente buscarPeloId(int id) {
		
		return clientes.stream().filter(c->c.getId()==id).findFirst().orElse(null);
	}

	public Cliente buscarPeloCodigoCliente(int codigoCliente) {

		return clientes.stream().filter(c->c.getCodigoCliente()==codigoCliente).findFirst().orElse(null);
	}

}
