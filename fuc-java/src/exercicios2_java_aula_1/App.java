package exercicios2_java_aula_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que simule um pequeno controle de estoque de uma loja.
		 * O sistema deverá cadastrar 3 produtos. Para cada produto, o programa deverá pedir:
		 * Nome do produto
		 * Quantidade em estoque
		 * Valor do produto
		 * Após registrar os três produtos, o programa deve:
		 * 5. Calcular o valor total de cada produto no estoque
		 * 6. Somar o valor total dos três produtos para descobrir o valor total do estoque
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String produto1;
		String produto2;
		String produto3;
		int qtdProduto1;
		int qtdProduto2;
		int qtdProduto3;
		double valorProduto1;
		double valorProduto2;
		double valorProduto3;
		
		
		System.out.println("====================================");
		System.out.println(" SISTEMA DE ESTOQUE");
		System.out.println("====================================");
		
		System.out.println("Cadastro do Produto 1\n \rDigite o nome do Produto :\n");
		produto1 = scan.nextLine();
		System.out.println("Digite a quatidade :\n");
		qtdProduto1 = scan.nextInt();
		System.out.println("Digite a valor :\n");
		valorProduto1 = scan.nextDouble();scan.nextLine();

		System.out.println("Cadastro do Produto 2\n \rDigite o nome do Produto :\n");
		produto2 = scan.nextLine();
		System.out.println("Digite o quantidade do produto :\n");
		qtdProduto2 = scan.nextInt();
		System.out.println("Digite o valor do produto :\n");
		valorProduto2 = scan.nextDouble();scan.nextLine();

		System.out.println("Cadastro do Produto 3\n \rDigite o nome do Produto :\n");
		produto3 = scan.nextLine();
		System.out.println("Digite a quantidade :\n");
		qtdProduto3 = scan.nextInt();
		System.out.println("Digite o valor do produto :\n");
		valorProduto3 = scan.nextDouble();
	
		System.out.println("Calculando valor do Estoque...");
		
		System.out.printf("Valor total do produto do %s : R$%.2f\n", produto1, qtdProduto1*valorProduto1);
		System.out.printf("Valor total do produto do %s : R$%.2f\n", produto2, qtdProduto2*valorProduto2);
		System.out.printf("Valor total do produto do %s : R$%.2f\n", produto3, qtdProduto3*valorProduto3);
		
		System.out.println("-----------------------------------");
		System.out.printf("VALOR TOTAL DO ESTOQUE : R$%.2f", (qtdProduto1*valorProduto1)+(qtdProduto2*valorProduto2)+(qtdProduto3*valorProduto3));
		
		
		
		
		scan.close();
	}

}
