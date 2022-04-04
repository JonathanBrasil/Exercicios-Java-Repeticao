package br.com.repeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int i, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número: ");
			i=leia.nextInt(); 
			soma = soma+i;
			
			
		} while (i!=0);
		
		System.out.println();
		System.out.println("A soma dos números digitados é de: "+soma);

	}

}
