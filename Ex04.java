package br.com.repeticao;

import java.util.Scanner;
import java.util.regex.MatchResult;

/*4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo ), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos. */


public class Ex04 {

	public static void main(String[] args) {
		
		//variaveis de perguntas
		int idade, sexo, persona;
		int continua;
		//variaveis de resultados
		int calmas=0, mNervosas=0, hAgressivos=0, oCalmos=0, nervosos40=0, calmos18=0;

		Scanner leia = new Scanner (System.in);
		
		do {
			
			System.out.println();
			System.out.println("Entre com a idade: ");
			idade = leia.nextInt();
			System.out.println();
			
			System.out.println("Entre com o sexo: (1-feminino / 2-masculino / 3-Outros");
			sexo = leia.nextInt();
			System.out.println();
			
			System.out.println("Entre com a personalidade: (1-calmo / 2-nervoso / 3-agressivo");
			persona = leia.nextInt();
			System.out.println();
			
			System.out.println("Continuar? Digite '1' para sim e '2' para não: ");
			continua = leia.nextInt();
			
			
				if(persona == 1) {
				calmas++;
				}
				
				if(sexo == 1 && persona == 2) {
					mNervosas++;
					}
				
				if(sexo == 2 && persona == 3) {
					hAgressivos++;
					}
				
				if(sexo == 3 && persona == 1) {
					oCalmos++;
					}
				
				if(persona == 2 && idade >=40) {
					nervosos40++;
					}
				
				if(persona == 1 && idade<18) {
					calmos18++;
					}
				
			
		} while (continua != 2);

		System.out.println("Encerrando...");
		System.out.println();
		System.out.println();
		
		System.out.println("A quantidade de pessoas calmas é de: " +calmas);
		System.out.println("A quantidade de mulheres nervosas é de: " +mNervosas);
		System.out.println("A quantidade de homens agressivos é de: " +hAgressivos);
		System.out.println("A quantidade de outros calmos é de: " +oCalmos);
		System.out.println("A quantidade de pessoas nervosas acima de 40 anos é de: " +nervosos40);
		System.out.println("A quantidade de pessoas calmas abaixo de 18 anos é de: " +calmos18);
		
		
		
	}

}
