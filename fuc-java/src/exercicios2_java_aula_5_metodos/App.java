package exercicios2_java_aula_5_metodos;

import java.util.Scanner;

public class App {
	public static int somar(int a, int b){	
		return a+b;
		
	} 

	public static void main(String[] args) {
		/*
		 * Crie um método public static int chamado somar que receba
		 * dois inteiros como parâmetros e RETORNE a soma. No main(),
		 * leia dois números com Scanner, chame o método e exiba o resultado retornado
		 */
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int resultado;
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número número:");
		num2 = scan.nextInt();
		resultado = somar(num1,num2);
		System.out.println("Soma é :" + resultado);
		
		scan.close();
	}

}
