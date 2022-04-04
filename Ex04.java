package br.com.repeticao;

import java.util.Scanner;
import java.util.regex.MatchResult;

/*4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo ), e as op��es 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos. */


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
			
			System.out.println("Continuar? Digite '1' para sim e '2' para n�o: ");
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
		
		System.out.println("A quantidade de pessoas calmas � de: " +calmas);
		System.out.println("A quantidade de mulheres nervosas � de: " +mNervosas);
		System.out.println("A quantidade de homens agressivos � de: " +hAgressivos);
		System.out.println("A quantidade de outros calmos � de: " +oCalmos);
		System.out.println("A quantidade de pessoas nervosas acima de 40 anos � de: " +nervosos40);
		System.out.println("A quantidade de pessoas calmas abaixo de 18 anos � de: " +calmos18);
		
		
		
	}

}
