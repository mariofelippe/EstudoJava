package com.estudo.fundamentos.desafios;

import java.util.Scanner;

public class DesafioDois {

	public static void main(String[] args) {
		// Escreva um programa em Java que verifica se um número é par ou ímpar.
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par!");
		}else {
			System.out.println("O número " + numero + " é ímpar!");
		}

	}

}
