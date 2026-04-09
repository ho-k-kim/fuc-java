package exercicios13_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList com 5 nomes de produtos de uma loja. Exiba a lista com a
		 * numeração de cada produto (1 a 5). Pergunte ao usuário qual posição deseja
		 * atualizar (1 a 5) e o novo nome. Use set() para substituir e exiba a lista
		 * atualizada. Repita o processo por 2 rodadas usando um for.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		List<String> produtos = new ArrayList<>();

		produtos.add("Notebook");
		produtos.add("Mouse");
		produtos.add("Teclado");
		produtos.add("Monitor");
		produtos.add("Headset");
		String produtoSubstituido;
		String novoProduto;
		int indexador;

		System.out.println("Lista de Produtos :" + produtos);
		for(int i=0; i<2;i++) {/**/
			System.out.println("-- Rodada "+(i+1)+"--");
			System.out.println("Qual posicao atualizar (1-5)? ");
			indexador=scan.nextInt();scan.nextLine();
			if(indexador <1 || indexador >produtos.size()) {
				do { System.out.println("Posição Ivalida");
				System.out.println("Qual posicao atualizar (1-5)? ");
				indexador=scan.nextInt();scan.nextLine();
				}while(indexador <1 || indexador >produtos.size());
			}
			produtoSubstituido = produtos.get((indexador-1));
			System.out.println("Novo nome: ");
			novoProduto = scan.nextLine();
			produtos.set(indexador-1, novoProduto);
			System.out.println(produtoSubstituido+"  substituido por "+novoProduto);
			System.out.println("Lista de Produtos :" + produtos);
			
			
			
			
		/**/}

		scan.close();
	}

}
