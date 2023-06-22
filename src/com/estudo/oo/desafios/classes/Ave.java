package com.estudo.oo.desafios.classes;

public class Ave extends Animal{

	public Ave(String nome) {
		super(nome);
		
	}
	
	public void voar() {
		System.out.println("Voando...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A ave está emitindo som...");
	}

}
