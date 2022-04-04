package br.com.repeticao;

import java.util.Scanner;

public class Ex02 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int i, x, totalImpar=0, totalPar=0;
		for (i=1; i <= 10; i++)
			{
			System.out.println("entre com a " +i+"º número: ");
			x = leia.nextInt(); 
			
			if (x%2 == 0) {
				totalPar += 1;
			}
				else totalImpar += 1; 
					
			}
		
		System.out.println("O total de números par são: "+totalPar);
		System.out.println("O total de números ímpares são: "+totalImpar);
			
			
			
		}
		
	
		
		
		
			
		

	}


