package estoque;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Uso de Operadores matematicos 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String nomeProduto;
		double valorProduto;
		int quantProduto;
		double resultadoFinal;
		
		
		System.out.println("=======Estoque==========");
		System.out.println("Digite o nome do produto");
		nomeProduto = scan.next();
		System.out.println("Digite o valor do produto");
		valorProduto = scan.nextDouble();
		System.out.println("Digite a quantidade de produto");
		quantProduto = scan.nextInt();
		
		resultadoFinal = valorProduto * quantProduto;
		
		System.out.printf("O valor do estoque: R$%.2f", resultadoFinal);
						
		scan.close();
	}

}
