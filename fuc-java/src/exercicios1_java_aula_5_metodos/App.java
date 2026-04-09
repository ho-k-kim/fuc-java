package exercicios1_java_aula_5_metodos;

import java.util.Scanner;

public class App {
	 public static void exibirSaudacao(String nome) {
		 System.out.println("Bem-vindo, " + nome + "!");
	 }

	public static void main(String[] args) {
		/*
		 * Crie uma classe com um método public static void chamado exibir
		 * Saudacao que receba um parâmetro String nome e imprima 'Bem-vindo, [nome]! '
		 * No main(), chame o método três vezes com nomes diferentes.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3;i++) {
			System.out.println("Digite o nome:");
			String nome= scan.nextLine();
			exibirSaudacao(nome);
		}
		scan.close();
	}

}
