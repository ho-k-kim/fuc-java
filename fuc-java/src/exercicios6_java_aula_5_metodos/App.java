package exercicios6_java_aula_5_metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um método public static List<Integer> filtrarPares que receba uma
		 * List<Integer> e retorne uma nova lista contendo apenas os números pares. No
		 * main(), crie uma lista com 8 números lidos pelo usuário, chame o método e
		 * exiba a lista original e a lista filtrada.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		List<Integer> numeros = new ArrayList<>();
		System.out.println("Digite 8 numeros:");
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite número " + (i + 1) + " :");
			numeros.add(scan.nextInt());
		}

		System.out.println("Original: " + numeros);

		System.out.println("Pares :" + filtrarPares(numeros));
		System.out.println("Total pares encontrados :" + filtrarPares(numeros).size());

		scan.close();

	}

	public static List<Integer> filtrarPares(List<Integer> numeros) {

		List<Integer> pares = new ArrayList<>();

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				pares.add(numeros.get(i));
			}

		}
		return pares;

	}
}
