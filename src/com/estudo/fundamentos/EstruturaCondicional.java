package com.estudo.fundamentos;

public class EstruturaCondicional {

	public static void main(String[] args) {
		//Estrutura condicional. 
		
		//if 
		
		int idade = 17;
		
		if(idade > 17) {
			System.out.println("Maior de idade.");
		}else {
			System.out.println("Menor de idade.");
		}
		// Mudando o valor da idade.
		idade = 18;
		
		if(idade > 17) {
			System.out.println("Maior de idade.");
			System.out.println(idade);
		}else {
			System.out.println("Menor de idade.");
		}
		
		String nome = "Mario";
		
		switch (nome) {
		case "Felippe":
			System.out.println("O nome é Felippe.");
			break;
		case "Mario":
			System.out.println("O nome é Mario.");
			nome = "Pedro";
		default:
			break;
		}
		
		switch (nome) {
		case "Felippe":
			System.out.println("O nome é Felippe.");
			break;
		case "Mario":
			System.out.println("O nome é Mario.");
		default:
			System.out.println("O nome não é nem Felippe e nem Mário.");
			break;
		}

	}

}
