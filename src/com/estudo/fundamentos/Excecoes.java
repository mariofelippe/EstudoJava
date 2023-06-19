package com.estudo.fundamentos;

public class Excecoes {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// Tratamento de exceções.
		
		String texto = null;
		
		System.out.println("Tratamento de Exceções...");
		try {
			System.out.println(texto.toUpperCase()); // Como o text é nulo um exceção é gerada.
		}catch (Exception e) {
			System.out.println("Exceção capturada " + e);
		}
		

		try {
			System.out.println(10/0);// Gera uma exceção devido o numero ser dividido por zero.
		}catch (ArithmeticException e) {
			System.out.println("Capturando a exceção específica " + e);
		}

		try {
			System.out.println("Não gera exceção!");// Não gera exceção.
		}catch (ArithmeticException e) {
			System.out.println("Capturando a exceção específica " + e);
		}finally {
			System.out.println("Finally sempre é executada mesmo que não ocorra exceção!");
		}
		
		
		

	}

}
