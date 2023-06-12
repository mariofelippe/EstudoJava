package com.estudo.fundamentos;

public class DeclaracaoMetodos {

	public static void main(String[] args) {
		// Criação e chamada de métodos.		

		escrever(); // Chamada do método.
		
		escrever("Método com parâmetro."); // chamado passando parâmetro.
		
		int resultado = soma(12, 3); // Método que retornar a soma de dois números.
		System.out.println("Resultado da soma: " + resultado);

	}
	
	public static void escrever() {
		System.out.println("Escrita na tela pelo método!");
	}
	
	// Sobrecarga
	public static void escrever(String mensagem) {
		System.out.println(mensagem);		
	}
	
	// Método com retorno.
	public static int soma(int primeiroNumero, int segundoNumero) {
		return primeiroNumero + segundoNumero;
	}

}
