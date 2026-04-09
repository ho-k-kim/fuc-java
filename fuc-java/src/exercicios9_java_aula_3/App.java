package exercicios9_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList com 5 produtos. Exiba a lista.
		 *  Remova o produto da posição 1 (por índice) e exiba novamente.
		 *  Peça ao usuário um nome de produto e tente removê-lo por valor — use contains() 
		 *  antes do remove() para verificar se ele existe.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		List<String>perifericos = new ArrayList<>();
		perifericos.add("Mouse");
		perifericos.add("Teclado");
		perifericos.add("Monitor");
		perifericos.add("Headset");
		perifericos.add("Webcam");
		String busca;
		System.out.println("Perifericos :"+perifericos);
		perifericos.remove(1);
		System.out.println("Perifericos :"+perifericos);
		System.out.println("Qual produto remover?\n ");
		busca = scan.next();
		if(perifericos.contains(busca)==true) {
			perifericos.remove(busca);
			System.out.println(busca+" - removido com sucesso");
			System.out.println(perifericos);
		}else {
			System.out.println(busca + " - não encontrado para remoção");
			System.out.println(perifericos);
		}
		
		
		
		
		scan.close();
		
	}

}
