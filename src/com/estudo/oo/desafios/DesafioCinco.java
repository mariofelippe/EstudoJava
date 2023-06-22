package com.estudo.oo.desafios;

import com.estudo.oo.desafios.classes.Aguia;
import com.estudo.oo.desafios.classes.Ave;

public class DesafioCinco {

	public static void main(String[] args) {
		/*  Desafio: Crie uma hierarquia de 
		classes em Java para representar diferentes tipos de animais, 
		com métodos específicos para cada tipo de animal.
		*/
		
		Ave ave = new Ave("Harpia");
		Aguia aguia = new Aguia("Aguia-Rei");
		ave.emitirSom(); // Método que faz a Ave emitir som.
		aguia.emitirSom(); // Método que faz a Aguia emitir som.
		
		
	}

}
