package exercicios9_java_aula_5_metodos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palavra="";
		//int vogal;
		System.out.println("Digite uma palavra:");
		palavra = scan.nextLine().toLowerCase();
		System.out.println("===StringUtils===");
		System.out.println("Vogais em '" + palavra + "' :"+StringUtils.contarVogais(palavra));
		System.out.println("Inverso : "+StringUtils.inverter(palavra));
		System.out.println("E palindromo?  " + StringUtils.isPalindromo(palavra));
		scan.close();

	}
	
}
