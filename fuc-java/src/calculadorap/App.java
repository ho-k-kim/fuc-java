package calculadorap;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Uso do se nao 
		
		
        Scanner scan= new Scanner(System.in); 
		
		double num1;
		double num2;
		char simbolo;
		double result;
		

		
		System.out.println("=====Calculadora=====");
		
		System.out.println("Digite o primeiro numero");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = scan.nextDouble();
		System.out.println("Digite o tipo e operação");
		System.out.println("+ para soma \n - para subtração \n / para divisão \n * para multiplicação \n % para resto ");
		
		simbolo = scan.next().charAt(0);
		
		if(simbolo !='+' && simbolo !='-' &&simbolo !='/' &&simbolo !='*' &&simbolo !='%') {
			System.out.println("Operação Inválida!");
		} else {
			result =	(simbolo =='+')?(num1+num2):
						(simbolo=='-')?(num1-num2):
						(simbolo=='/')?(num1/num2):
						(simbolo=='*')?(num1*num2):
						(simbolo=='%')?(num1%num2):
						0;
			System.out.printf("O valor de %.2f %s %.2f = %.2f ", num1,simbolo,num2, result);
		}

		scan.close();
	}

}
