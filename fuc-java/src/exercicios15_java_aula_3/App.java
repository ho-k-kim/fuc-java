package exercicios15_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Simule um controle de estoque usando duas listas paralelas: uma com os nomes dos
		 * produtos (String) e outra com as quantidades em estoque (Integer). O sistema deve
		 * cadastrar 4 produtos, permitir buscar um produto por nome para ver sua quantidade, 
		 * atualizar a quantidade com set() e identificar produtos com estoque crítico (quantidade <= 5).
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		//**
		List <String> produtos = new ArrayList<>();
		List <Integer> qtds = new ArrayList<>();
		List <Double> precos = new ArrayList<>();
		String buscaProduto;
		int indexProduto;
		double totalProduto;
		double resultadoFinal=0;
		 
		for(int i=0; i<4; i++) {
			System.out.println("Digite o produto " +(i+1) + ":" );
			produtos.add(scan.nextLine());
			System.out.println("Digite o quantidade " +(i+1) + ":" );
			qtds.add(scan.nextInt());
			System.out.println("Digite o preço " +(i+1) + ":" );
			precos.add(scan.nextDouble());scan.nextLine();
			totalProduto=qtds.get(i)*precos.get(i);
			resultadoFinal +=totalProduto;
		}
		System.out.println("===============================================================\n" );
		System.out.println("				SISTEMA DE ESTOQUE\n" );
		System.out.println("===============================================================\n" );
		for(int i=0; i<produtos.size(); i++) {
			System.out.printf("Produto %d : %s Quantidade : %d Preços : R$ %.2f total: R$ %.2f\n",(i+1), produtos.get(i), qtds.get(i), precos.get(i),(qtds.get(i)*precos.get(i)));
		}
		System.out.println("===============================================================\n" );
		System.out.printf("Total dos Produtos : R$ %.2f", resultadoFinal);
		System.out.println("\n===============================================================\n" );
		System.out.println("Digite o Produto a Buscar :\n");
		buscaProduto=scan.nextLine();
		if(produtos.contains(buscaProduto)==false) {
			System.out.println("Busca Produto: " +buscaProduto+ " não encontrado!");
		}
		else {
		indexProduto=produtos.indexOf(buscaProduto);
		
		System.out.printf("Busca Produto : %s \n %s - estoque atual : %d  preco: R$ %.2f total: R$ %.2f",produtos.get(indexProduto),produtos.get(indexProduto), qtds.get(indexProduto), precos.get(indexProduto), (precos.get(indexProduto)*qtds.get(indexProduto)));
		}
		
		System.out.println("\n=== ESTOQUE CRITICO (qtd <= 5) ===");
		for(int i=0; i<produtos.size();i++) {
			if(qtds.get(i)<=5) {
				System.out.println(produtos.get(i)+" - apenas "+qtds.get(i)+" unidades !");
			}
		}
		
		//**
		scan.close();
		
	}

}
