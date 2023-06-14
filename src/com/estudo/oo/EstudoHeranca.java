package com.estudo.oo;

import com.estudo.oo.classes.Carro;
import com.estudo.oo.classes.Veiculo;

public class EstudoHeranca {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("ADV-1234", 4, "Azul"); // Instanciando classe.
		System.out.println("Classe veiculo - Placa: " + veiculo.getPlaca());
		veiculo.ligar(); // ligando veículo.
		veiculo.desligar();
		Carro carro = new Carro("DAS-3423",4,"Preto",4);
		System.out.println("Classe Carro - Placa: " + carro.getPlaca());
		carro.ligar(); // ligando carro.
		carro.desligar();
		
		
		

	}

}
