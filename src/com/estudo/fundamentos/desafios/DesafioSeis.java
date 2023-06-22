package com.estudo.fundamentos.desafios;

import java.util.Scanner;

public class DesafioSeis {

	public static void main(String[] args) {
		/*
		 * Desafio: Escreva um programa em Java que solicite a 
		 * entrada de um número e trate a exceção caso o usuário 
		 * informe um valor inválido.
		 *  
		 */

		Scanner sc = new Scanner(System.in);
		int numero = 1;
		while(numero > 0) {
			try {
				System.out.print("Informe um número para saber se é par ou impar (zero para sair): ");
				numero = sc.nextInt();
				if(numero%2 == 0) {
					System.out.println("O número " + numero + " é par!");
				}else {
					System.out.println("O número " + numero + " é ímpar!");
				}
				
			}catch (Exception e) {
				System.err.println("Erro! Número inválido! "+ e);
				numero = 1;
			}			
			
		}
		System.out.println("Programa encerrado.");
		sc.close();
		
		
		
	}

}
