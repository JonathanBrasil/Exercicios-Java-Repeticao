package br.com.repeticao;

import java.util.Scanner;

public class Ex02 {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int i, x, totalImpar=0, totalPar=0;
		for (i=1; i <= 10; i++)
			{
			System.out.println("entre com a " +i+"� n�mero: ");
			x = leia.nextInt(); 
			
			if (x%2 == 0) {
				totalPar += 1;
			}
				else totalImpar += 1; 
					
			}
		
		System.out.println("O total de n�meros par s�o: "+totalPar);
		System.out.println("O total de n�meros �mpares s�o: "+totalImpar);
			
			
			
		}
		
	
		
		
		
			
		

	}


