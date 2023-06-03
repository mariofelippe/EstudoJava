package com.estudo.fundamentos;

public class ConversaoTipos {

	public static void main(String[] args) {
		
		//Conversão de tipos. 
		
		double preco = 50.23;
		System.out.println(preco);
		
		int idade = (int)preco; // Casting realizado explicitamente.
		System.out.println(idade);
		
		idade = 'a'; // Casting implícito. -> idade é do tipo int.
		System.out.println(idade);
		
		char sexo = 'M';		
		System.out.println(sexo);
		
		int valorSexo = (int)sexo;
		System.out.println(valorSexo);
		
		
		

	}

}
