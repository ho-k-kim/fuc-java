package exercicios7_java_aula_2_parte_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que fique pedindo números ao usuário em loop. A cada número digitado, o
programa acumula a soma. Quando o usuário digitar 0, o loop encerra e o programa exibe a
soma total e a quantidade de números digitados (sem contar o zero)
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int numero;
		int soma=0;
		int qtd=0;
		
		System.out.println("Digite um numero (0 para encerrar):");
		numero = scan.nextInt();
		while( numero !=0) {
			 soma += numero;
			    qtd++;
			    System.out.println("Proximo numero (0 para encerrar):");
			    numero = scan.nextInt();  // leitura DENTRO do while
		}
		System.out.println("Soma total: " + soma);
	    System.out.println("Numeros digitados: " + qtd);
	    
		scan.close();
	}

}
