package com.estudo.fundamentos.desafios;

import java.util.Scanner;

public class DesafioUm {

	public static void main(String[] args) {
		// Desafio: Escreva um programa em Java que calcule a média de notas de um aluno.
		
		float primeiraNota, segundaNota, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		primeiraNota = sc.nextInt();
		System.out.println("Informe a segunda nota: ");
		segundaNota = sc.nextInt();
		media = primeiraNota + segundaNota / 2;
		System.out.println("A do Aluno é: " + media);
		
		sc.close();
		

	}

}
