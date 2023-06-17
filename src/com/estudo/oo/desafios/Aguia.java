package com.estudo.oo.desafios;

public class Aguia extends Ave{

	public Aguia(String nome) {
		super(nome);
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("grasnando...");
	}

}
