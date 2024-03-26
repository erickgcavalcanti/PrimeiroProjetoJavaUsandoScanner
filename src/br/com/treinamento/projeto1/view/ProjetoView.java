package br.com.treinamento.projeto1.view;

import java.util.Scanner;

import br.com.treinamento.projeto1.model.enums.Menu;

public class ProjetoView {
	
	private static ClienteView clienteView;

	public static void main(String[] args) {
		clienteView = new ClienteView();
		exibirMenuPrincipal();
	}

	private static void exibirMenuPrincipal() {
		String opcao = "";
		Scanner scannerMenu = new Scanner(System.in);
	    while(!opcao.equals(Menu.SAIR.getDescricao())){
	    	exibirTextoMenuPrincipal();
	    	opcao = getOpcaoStringSubMenu(scannerMenu);
	    	System.out.println("");
	    	if(opcao.equals(Menu.CADASTRAR.getDescricao())) {
	    		exibirMenuCadastrar(scannerMenu);
	    	}else if(opcao.equals(Menu.BUSCAR_POR_ID.getDescricao())) {
	    		exibirMenuBuscarPeloId(scannerMenu);
	    	}else if(opcao.equals(Menu.BUSCAR_POR_CODIGO.getDescricao())) {
	    		exibirMenuBuscarPeloCodigoCliente(scannerMenu);
	    	}else if(opcao.equals(Menu.SAIR.getDescricao())) {
	    		System.out.println("Fim do primeiro projeto Java");
	    	}else{
	    		System.out.println("Opção Inválida. Tente novamente.");
	    	}
		}
		scannerMenu.close();
	}

	private static void exibirTextoMenuPrincipal() {
		System.out.println("");
		System.out.println("Primeiro projeto Java");
		System.out.println("");
		System.out.println("Digite Opção Desejada:");
		System.out.println(Menu.CADASTRAR.getDescricao() + " - Cadastrar");
		System.out.println(Menu.BUSCAR_POR_ID.getDescricao() + " - Buscar pelo Id");
		System.out.println(Menu.BUSCAR_POR_CODIGO.getDescricao() + " - Buscar pelo Código do Cliente");
		System.out.println(Menu.SAIR.getDescricao() + " - Sair");
		System.out.println("");
		System.out.println("Opção: ");
	}

	private static void exibirMenuCadastrar(Scanner scannerMenu) {
		System.out.println("Digite o Nome Completo do Cliente: ");
		String nomeCompleto = getOpcaoStringSubMenu(scannerMenu);
		System.out.println("Digite o Data de Nascimento do Cliente: ");
		String dataNascimento = getOpcaoStringSubMenu(scannerMenu);
		System.out.println("Digite o Endereço do Cliente: ");
		String endereco = getOpcaoStringSubMenu(scannerMenu);
		System.out.println("Digite o Código do Cliente: ");
		int codigoCliente = getOpcaoIntSubMenu(scannerMenu);
		clienteView.cadastrar(nomeCompleto, dataNascimento, endereco, codigoCliente);
	}

	private static void exibirMenuBuscarPeloCodigoCliente(Scanner scannerMenu) {
		System.out.println("Digite o Código do Cliente desejado: ");
		int codigoCliente = getOpcaoIntSubMenu(scannerMenu);
		clienteView.buscarPeloCodigoCliente(codigoCliente);
	}

	private static void exibirMenuBuscarPeloId(Scanner scannerMenu) {
		System.out.println("Digite o Id do Cliente desejado: ");
		int id = getOpcaoIntSubMenu(scannerMenu);  
		clienteView.buscarPeloId(id);
	}

	private static int getOpcaoIntSubMenu(Scanner scannerMenu) {
		try {
			int opcaoSubMenu = Integer.parseInt(scannerMenu.nextLine());
			return opcaoSubMenu;
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido. Favor digite somente números.");
			return getOpcaoIntSubMenu(scannerMenu);
		}
	}
	
	private static String getOpcaoStringSubMenu(Scanner scannerMenu) {
		String opcaoSubMenu = scannerMenu.nextLine();
		return opcaoSubMenu;
	}

}
