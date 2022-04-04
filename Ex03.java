package br.com.repeticao;

import java.util.Scanner;

public class Ex03 {
//	3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade, menos21=0, entre=0, mais50=0;
		
		do {
			System.out.println("Digite -99 para sair");
			System.out.println("Entre com a idade: ");
			idade = leia.nextInt();
			System.out.println();
			
	
				if (idade>=50) {
					mais50++;
				}
				if (idade >= 0 && idade<21) {
					menos21++;
				}
				if (idade >=21 && idade<50) {
					entre++;
				}
				if (idade == -99) {
					System.out.println("Saindo...");
				}
				
			
		} while (idade != -99);
		
		System.out.println();
		System.out.println("O total de pessoas com menos de 21 anos é de: "+menos21);
		System.out.println("O total de pessoas com mais de 50 anos é de: "+mais50);
		
	}

}
