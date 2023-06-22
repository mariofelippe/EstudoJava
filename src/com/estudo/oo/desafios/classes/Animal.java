package com.estudo.oo.desafios.classes;

public abstract class Animal {

	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
		
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void emitirSom() {
		System.out.println("Emitindo som...");
	}
	
}
