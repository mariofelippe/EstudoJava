package com.estudo.fundamentos.desafios;

public class DesafioTres {

	public static void main(String[] args) {
		// Desafio: Escreva um método em Java que calcule o fatorial de um número
		
		System.out.println(fatorial(6));

	}
	
	public static int fatorial(int numero) {
		int fatorial = 1;
		
		for(int i = numero; i >= 1; i--) {
			
			fatorial *= i;
		}
		
		return fatorial;
	}

}
