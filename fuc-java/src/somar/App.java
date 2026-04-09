package somar;

import java.util.Scanner;

public class App {
	
	public static int somar(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Chamando funcao somar criada
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();

		int resultado = somar(num1, num2);

		System.out.println("Resultado da função: " + num1 + " + " + num2 + " = " + resultado);

		scanner.close();

	}

}
