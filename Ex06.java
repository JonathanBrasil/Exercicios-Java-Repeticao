package br.com.repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variável i vai receber quantidade de vezes que um numero multiplo de 3 é informado
		//variável numero vai registrar o valor informado
		//variável soma vai receber a soma total dos números multiploes de 3
		//variável media vai receber a média
		
		int i=0, numero, soma=0;
		double media;
		
		// vamos fazer o seguinte:
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			// se o numero digitado, ao dividir por 3 o resultado for = 0 (multiplo de 3)
			if(numero % 3 == 0 && numero !=0) 
			{
				soma = soma+numero;
				i++;
			} 
			
		} while (numero != 0);
		//enquanto o número que eu digitar não for 0
		
		
		//Quando eu digitar 0, vamos parar de solicitar pra digitar número
		//Dai vai passar para os resultados:
		media = soma/i;
		System.out.println("A quantidade informada de números multiploes de 3 é: "+i);
		System.out.println("A soma desses números é de: "+soma);
		System.out.println("A média desses números múltiplos de 3 é de: "+media);
		
			}
	
		
}
	

			


			
			
			
		


