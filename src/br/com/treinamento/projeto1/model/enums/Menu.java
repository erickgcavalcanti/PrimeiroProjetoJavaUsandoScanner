package br.com.treinamento.projeto1.model.enums;

public enum Menu {

	CADASTRAR("1"), 
	BUSCAR_POR_ID("2"),
	BUSCAR_POR_CODIGO("3"),
	SAIR("4");

	private String descricao;

	Menu(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}