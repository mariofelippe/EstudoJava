package com.estudo.oo;

import com.estudo.oo.classes.Aviao;

public class EstudoAbstrata {

	public static void main(String[] args) {
		// Estudo de classes abstratas, interface e sobrescrita de métodos.
		Aviao aviao = new Aviao("Boeing ","727",189,3);
		
		aviao.ligar();
		aviao.desligar();
		
	}

}
