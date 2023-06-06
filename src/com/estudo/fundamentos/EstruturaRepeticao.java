package com.estudo.fundamentos;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		// Estrutura de repetição. for, while e do while.
		
		for(int i=0; i<=10 ;i++) {
			System.out.println("for: "+ i);
		}
		
		int i =0;
		while(i<=10) {			
			System.out.println("while: "+ i);
			i++;			
		}
		i=0;
		do {
			System.out.println("do while:" + i);	
			i++;
		} while (i != 10);

	}

}
