package exercicios4_java_aula_5_metodos;

import java.util.Scanner;

public class App {

	 public static double calcular(double num1, double num2, char simbolo) {
		  
				 switch(simbolo) {
					
					case '+':
						return num1 + num2;
										
					case '-':
						return num1 - num2;
					case '/':
						return num1 / num2;
					case '*':
						return num1 * num2;
					case '%':
						return num1 % num2;
					default:
						System.out.println("Operação inválida");
				 }
				}
	
	public static void main(String[] args) {
		/*
		 * 
		 * Crie um método public static double calcular que receba dois doubles e um char
		 * representando a operação (+, -, *, /). O método deve usar switch para executar 
		 * a operação e retornar o resultado. Trate divisão por zero retornando Double.
		 * NaN e exibindo aviso.
		 */
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		char simbolo;
		double resultado;
		
		System.out.println("Digite o numero1:");
		num1=scan.nextDouble(); 
		System.out.println("Digite o numero2:");
		num2=scan.nextDouble(); 
		System.out.println("simbolo + - / * %%\n");
		simbolo=scan.next().charAt(0);
		resultado = calcular(num1,num2,simbolo);
		System.out.println(resultado);
		
		scan.close();
	
	}
		
}
