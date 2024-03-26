package br.com.treinamento.projeto1.view;

import br.com.treinamento.projeto1.controller.ClienteController;
import br.com.treinamento.projeto1.model.Cliente;

public class ClienteView {

	private ClienteController clienteController;

	public ClienteView() {
		super();
		clienteController = new ClienteController();
	}

	public void cadastrar(String nomeCompleto, String dataNascimento, String endereco, int codigoCliente) {
		Cliente cliente = new Cliente();
		cliente.setNomeCompleto(nomeCompleto);
		cliente.setDataNascimento(dataNascimento);
		cliente.setEndereco(endereco);
		cliente.setCodigoCliente(codigoCliente);
		Cliente clienteCadastrado = clienteController.cadastrar(cliente);
		if (clienteCadastrado != null) {
			System.out.println("Cliente cadastrado com sucesso!");
		}
	}

	public void buscarPeloId(int id) {
		Cliente cliente = clienteController.buscarPeloId(id);
		if (cliente != null) {
			System.out.println("Dados do Cliente");
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nome Completo: " + cliente.getNomeCompleto());
			System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
			System.out.println("Endereço: " + cliente.getEndereco());
			System.out.println("Código do Cliente: " + cliente.getCodigoCliente());
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

	public void buscarPeloCodigoCliente(int codigoCliente) {
		Cliente cliente = clienteController.buscarPeloCodigoCliente(codigoCliente);
		if (cliente != null) {
			System.out.println("Dados do Cliente");
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nome Completo: " + cliente.getNomeCompleto());
			System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
			System.out.println("Endereço: " + cliente.getEndereco());
			System.out.println("Código do Cliente: " + cliente.getCodigoCliente());
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}

}
