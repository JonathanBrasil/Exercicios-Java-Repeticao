package br.com.repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//vari�vel i vai receber quantidade de vezes que um numero multiplo de 3 � informado
		//vari�vel numero vai registrar o valor informado
		//vari�vel soma vai receber a soma total dos n�meros multiploes de 3
		//vari�vel media vai receber a m�dia
		
		int i=0, numero, soma=0;
		double media;
		
		// vamos fazer o seguinte:
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			// se o numero digitado, ao dividir por 3 o resultado for = 0 (multiplo de 3)
			if(numero % 3 == 0 && numero !=0) 
			{
				soma = soma+numero;
				i++;
			} 
			
		} while (numero != 0);
		//enquanto o n�mero que eu digitar n�o for 0
		
		
		//Quando eu digitar 0, vamos parar de solicitar pra digitar n�mero
		//Dai vai passar para os resultados:
		media = soma/i;
		System.out.println("A quantidade informada de n�meros multiploes de 3 �: "+i);
		System.out.println("A soma desses n�meros � de: "+soma);
		System.out.println("A m�dia desses n�meros m�ltiplos de 3 � de: "+media);
		
			}
	
		
}
	

			


			
			
			
		


