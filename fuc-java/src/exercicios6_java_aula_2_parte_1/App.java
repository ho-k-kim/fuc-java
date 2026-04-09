package exercicios6_java_aula_2_parte_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que peça ao usuário um número positivo. Se o usuário digitar zero ou
negativo, o programa deve pedir novamente. Só aceita e exibe o número quando ele for
maior que zero.
		 */
		Scanner scan = new Scanner(System.in);
		int num=0;
		while(num<=0) {
			System.out.println("Digite o numero maior que zero:");
			num = scan.nextInt();
		}
			System.out.println("Voce digitou: " + num);
		scan.close();
	}

}
