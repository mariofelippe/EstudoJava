package com.estudo.oo.desafios.classes;

public class Aguia extends Ave{

	public Aguia(String nome) {
		super(nome);
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("grasnando...");
	}

}
