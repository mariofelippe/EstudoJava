package com.estudo.oo.classes;

public class Carro extends Veiculo{

	private int quantidadePortas;
	
	
	public Carro(String placa, int quantidadeRodas, String cor, int quantidadePortas) {
		super(placa, quantidadeRodas, cor);
		this.setQuantidadePortas(quantidadePortas);
		
	}


	public int getQuantidadePortas() {
		return quantidadePortas;
	}


	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	// Reescrevendo o método.
	@Override
	public void desligar() {
		System.out.println("Desligando o carro...");
	}

}
