package br.com.repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int i=0, numero, soma=0;
		double media;
		
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero !=0) 
			{
				soma = soma+numero;
				i++;
			} 
			
		}while (numero != 0);
					
		media = soma/i;
		System.out.println("A quantidade informada de n�meros multiploes de 3 �: "+i);
		System.out.println("A soma desses n�meros � de: "+soma);
		System.out.println("A m�dia desses n�meros m�ltiplos de 3 � de: "+media);
		
			}
	
		
}
	

			


			
			
			
		


