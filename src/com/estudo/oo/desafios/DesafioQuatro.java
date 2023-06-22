package com.estudo.oo.desafios;

import com.estudo.oo.desafios.classes.Carro;

public class DesafioQuatro {

	public static void main(String[] args) {
		/* Desafio: Crie uma classe em Java que represente um carro, 
		com atributos como marca, modelo, ano, e métodos para ligar, desligar e acelerar.
		*/
		
		Carro carro = new Carro("Fiat","Uno",2010);
		
		carro.ligar();
		carro.acelerar();
		carro.desligar();
	}

}
