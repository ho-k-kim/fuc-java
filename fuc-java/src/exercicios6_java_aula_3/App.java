package exercicios6_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList de String. Peça ao usuário para digitar 5 frutas. 
		 * Adicione cada uma com add(). Exiba a lista completa, 
		 * o tamanho com size() e a primeira e última fruta usando get()
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		List <String> frutas = new ArrayList<>();
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite fruta :");
			frutas.add(scan.nextLine());
		}
		System.out.println("As Frutas são :"+frutas);
		System.out.println("O Tamanho da Lista é :" + frutas.size());
		System.out.println("A primeira fruta da lista é :"+ frutas.get(0));
		System.out.println("A ultima fruta da lista é :"+frutas.get(frutas.size()-1));
		
		scan.close();
		
	}

}
