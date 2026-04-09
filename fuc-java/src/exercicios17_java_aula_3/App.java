package exercicios17_java_aula_3;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia 6 palavras e armazene em um array de String. Sem usar nenhum método pronto de
		   inversão, crie um segundo array e preencha-o com os elementos do primeiro em ordem
		   inversa. Exiba o original e o invertido 
		 */

		String[] original = {"Java","Trem","Vagao","Array","Lista","Codigo"};
		System.out.println("Original :" +Arrays.deepToString(original));
		String[] copia = Arrays.copyOf(original, 6);
		System.out.println("Copia :" +Arrays.deepToString(copia));
		for(int i=0; i<original.length;i++) {
			copia[original.length-1-i] = original[i];
		}
		System.out.println("Invertido :" +Arrays.deepToString(copia));
		
		
		
	}

}
