package exercicios2_java_aula_3;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia 5 nomes digitados pelo usuário, armazene em um array de String e use Arrays.sort()
		 * para ordená-los. Exiba os nomes antes e depois da ordenação.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String [] nomes = new String[5];
		for(int i=0; i<5;i++) {
			System.out.println("Digite o nome " + (i+1) +" :");
			nomes[i] = scan.nextLine();
		}
		System.out.println(Arrays.toString(nomes));
		Arrays.sort(nomes);
		System.out.println(Arrays.toString(nomes));
		
		
		scan.close();
		
	}

}
