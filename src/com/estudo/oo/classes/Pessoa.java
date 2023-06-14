package com.estudo.oo.classes;

public class Pessoa {

	private String nome;
	public int idade;
	protected String apelido;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void andar() {
		System.out.println("Andando...");
	}
	
	public void falar(String frase) {
		System.out.println(frase);
	}
}
