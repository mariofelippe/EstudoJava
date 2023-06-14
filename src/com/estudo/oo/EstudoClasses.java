package com.estudo.oo;

import com.estudo.oo.classes.Pessoa; // Importa a classe a ser instanciada.

public class EstudoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa(); // Instanciando classe pessoa.
		pessoa.setNome("Fernando"); //Adicionado o nome de forma encapsulada
		System.out.println(pessoa.getNome()); // Imprimendo o nome em tela.
		pessoa.idade = 20; // Idade adicionada diretamente no atributo public.
		System.out.println(pessoa.idade);
	}

}
