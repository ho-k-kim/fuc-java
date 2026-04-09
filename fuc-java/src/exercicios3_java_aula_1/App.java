package exercicios3_java_aula_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que funcione como uma calculadora simples.
		 * O sistema deve:
		 * 7.Pedir ao usuário dois números
		 *8.Perguntar qual operação matemática deseja realizar
		 *9.Realizar a operação escolhida e mostrar o resultado
		 *As operações disponíveis devem ser:
			* 1 — Soma
			* 2 — Subtração
			* 3 — Multiplicação
			* 4 — Divisão
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("       CALCULADORA JAVA");
		System.out.println("====================================");
		
		double num1;
		double num2;
		char simbolo;
		double resultado;
		
		System.out.println("Digite o primeiro número :");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo  número :");
		num2 = scan.nextDouble();
		System.out.println("Escolha a operação desejada:igite o primeiro número :\n 1 - +  soma\n 2 - - subtração\n 3 - * multiplicação\n 4 - / divisão\n 5- % resto\n\n \rDigite simbolo da operação :\n ");
		simbolo = scan.next().charAt(0);
		if(simbolo !='+' && simbolo !='-' && simbolo !='*' && simbolo !='*' && simbolo !='/' && simbolo !='%'){
			System.out.println("Operação inválida");
		} else if(simbolo =='+') {
			System.out.printf("Resultado da operação de soma : %.2f %s %.2f = %.2f",num1,simbolo,num2, (num1+num2));
		} else if(simbolo =='-') {
			System.out.printf("Resultado da operação de subtração : %.2f %s %.2f = %.2f",num1,simbolo,num2, (num1-num2));
		}else if(simbolo =='*') {
			System.out.printf("Resultado da operação de multiplicação : %.2f %s %.2f = %.2f",num1,simbolo,num2, (num1*num2));
		}else if(simbolo =='/') {
			System.out.printf("Resultado da operação de divisão : %.2f %s %.2f = %.2f",num1,simbolo,num2, (num1/num2));
		}else if(simbolo =='%') {
			System.out.printf("Resultado da operação de resto : %.2f %s %.2f = %.2f",num1,simbolo,num2, (num1%num2));
		}
		
			
		
		scan.close();
		
		

	}

}
