package com.estudo.oo.classes;

public class Aviao extends Aeronave{
	
	private int quantidadeTurbina;	

	public Aviao(String nome, String modelo, int quantidadeLugares, int quantidadeTurbina) {
		super(nome, modelo, quantidadeLugares);
		this.quantidadeTurbina = quantidadeTurbina;
	}

	public int getQuantidadeTurbina() {
		return quantidadeTurbina;
	}

	public void setQuantidadeTurbina(int quantidadeTurbina) {
		this.quantidadeTurbina = quantidadeTurbina;
	}
	
	
	@Override
	public void ligar() {
		System.out.println("Ligando o Avião...");
		System.out.println("Avião ligado!");
	}
	

}
