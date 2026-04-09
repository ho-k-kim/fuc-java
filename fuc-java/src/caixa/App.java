package caixa;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Validado de nome e idade
		Scanner scan = new Scanner(System.in);
		boolean inter = true;
		int contador= 0;
		String nome;
		int idade;
		double saldo;
		
		while(inter) {	
			contador+= 1;
			System.out.println(contador);
			System.out.println("Escreva seu nome");
			nome = scan.next();
			if (nome.equals("Roberto")) {
				System.out.println("Olá roberto va para outra pagina");
				continue;
			}
			System.out.println("Escreva sua idade");
			idade = scan.nextInt();
			if (idade <=16) {
				System.out.println("Voce nao devia estar aqui!!");
				break;
			}
			System.out.println("Escreva seu saldo");
			saldo = scan.nextDouble();
			if (saldo > 10000) {
				System.out.println("Seu saldo é maior que R$10.000");
			}
		}
		scan.close();
	}
}

