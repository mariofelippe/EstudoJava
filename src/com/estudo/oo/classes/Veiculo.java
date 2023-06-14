package com.estudo.oo.classes;

public class Veiculo {

	private String placa;
	private int quantidadeRodas;
	private String cor;
	
	
	public Veiculo(String placa, int quantidadeRodas, String cor) {
		this.placa = placa;
		this.quantidadeRodas = quantidadeRodas;
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}


	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {		
		System.out.println("Ligando...");
	}
	public void desligar() {
		System.out.println("Desligando...");
	}
	
}
