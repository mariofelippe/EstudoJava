package com.estudo.fundamentos;

import com.estudo.fundamentos.excecoes.MenorIdadeException;

public class ExcecaoPersonalizada {

	public static void main(String[] args) {

		int idade = 17;
		
		try {
			verificaIdade(idade);
		}catch (MenorIdadeException e) {
			System.out.println("A exeção foi gerada " + e);
		}

	}
	
	public static void verificaIdade(int idade) throws MenorIdadeException{
		if(idade < 18) {
			throw new MenorIdadeException("Menor idade!");
		}
	}

}
