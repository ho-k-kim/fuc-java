package calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Uso de if else
		 * 
		 * 
		 */
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
		
		if (simbolo == '+') {
			result = num1 + num2;
			System.out.printf("O valor de %.2f + %.2f = ", num1,num2);
			System.out.println(result);
		} else if( simbolo == '-') {
			result = num1 - num2;
			System.out.printf("O valor de %.2f - %.2f = ", num1,num2);
			System.out.println(result);
		} else if(simbolo == '/') {
			result = num1 / num2;
			System.out.printf("O valor de %.2f / %.2f = ", num1,num2);
			System.out.println(result);
		} else if (simbolo == '*') {
			result = num1 * num2;
			System.out.printf("O valor de %.2f * %.2f = ", num1,num2);
			System.out.println(result);
		} else if (simbolo == '%') {
			result = num1 % num2;
			System.out.printf("O valor de %.2f %s %.2f = ", num1, "%",num2);
			System.out.println(result);
		} else {
			System.out.println("Operação inválida");			
		}
		
		scan.close();

	}

}
