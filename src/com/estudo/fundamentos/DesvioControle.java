package com.estudo.fundamentos;

public class DesvioControle {

	public static void main(String[] args) {
		// Desvio de control break e continue.
		
		for(int i =0; i < 10; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("Executando o break.");
				break;
			}
		}
		int n = 0;
		while(true) {			
			n++;
			
			if(n%2 == 0) {
				System.out.println("Continue...");
				continue;
			}
			
			System.out.println("N: " + n);			
			if(n > 50) {
				break;
			}
			
			
		}

	}

}
