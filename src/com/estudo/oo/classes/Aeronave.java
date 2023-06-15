package com.estudo.oo.classes;

import com.estudo.oo.classes.interfaces.Motor;

public abstract class Aeronave implements Motor{
	
	private String nome;
	private String modelo;
	private int quantidadeLugares;
	
	
	public Aeronave(String nome, String modelo, int quantidadeLugares) {
		this.nome = nome;
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}
	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}
	
	
	public void ligar() {
		System.out.println("Ligando...");
		System.out.println("Ligada!");
	}
	
	public void desligar() {
		System.out.println("Desligando...");
		System.out.println("Desligada!");
	}
	
	

}
