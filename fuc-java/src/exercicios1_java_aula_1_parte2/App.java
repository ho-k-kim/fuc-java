package exercicios1_java_aula_1_parte2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programaque simule o menu de pedidos de uma doceria.
		 * O programa exibe os produtos
		 * disponíveis com seus preços e permite que o cliente 
		 * escolha a quantidade desejadade cada item.
		 */
		Scanner  scan = new Scanner(System.in);
		
		String produto1 = "Brigadeiro";
		String produto2 = "Beijinho";
		String produto3 = "Trufa de Chocolate";
		String produto4 = "Fatia de Bolo no Pote";
		double valorProduto1=4.50;
		double valorProduto2=4.50;
		double valorProduto3=7.00;
		double valorProduto4=12.00;
		int qtdProduto1;
		int qtdProduto2;
		int qtdProduto3;
		int qtdProduto4;
		double totalValorProduto1;
		double totalValorProduto2;
		double totalValorProduto3;
		double totalValorProduto4;
		double totalCompra;
		
		
		
		System.out.println("====================================");
		System.out.println("       DOCERIA DA MARIA");
		System.out.println("====================================");
		System.out.printf(" 1- %s R$ %.2f\n 2- %s R$ %.2f\n 3- %s R$ %.2f\n 4- %s R$ %.2f\n", produto1, valorProduto1,produto2, valorProduto2,produto3, valorProduto3,produto4, valorProduto4);
		System.out.println("------------------------------------\n");
		System.out.println("Quantos Brigadeiros você deseja?");
		qtdProduto1 = scan.nextInt();
		System.out.println("Quantos Beijinho você deseja?");
		qtdProduto2 = scan.nextInt();
		System.out.println("Quantos Trufa de Chocolate você deseja?");
		qtdProduto3 = scan.nextInt();
		System.out.println("Quantos Fatia de Bolo no Pote você deseja?");
		qtdProduto4 = scan.nextInt();
		totalValorProduto1 = qtdProduto1* valorProduto1;
		totalValorProduto2 = qtdProduto2* valorProduto2;
		totalValorProduto3 = qtdProduto3* valorProduto3;
		totalValorProduto4 = qtdProduto4* valorProduto4;
		totalCompra = totalValorProduto1+totalValorProduto2+totalValorProduto3+totalValorProduto4;
		
		System.out.println("\n======== RESUMO DO PEDIDO ==========");
		
		System.out.printf(" 1- %s (%dx)........R$ %.2f\n 2- %s (%dx)........R$ %.2f\n 3- %s (%dx)........R$ %.2f\n 4- %s (%dx)........R$ %.2f\n", 
				produto1,qtdProduto1, /*(qtdProduto1*valorProduto1)*/totalValorProduto1,
				produto2,qtdProduto2, /*(qtdProduto2*valorProduto2)*/totalValorProduto2,
				produto3,qtdProduto3, /*(qtdProduto3*valorProduto3)*/totalValorProduto3,
				produto4,qtdProduto4, /*(qtdProduto4*valorProduto4)*/totalValorProduto4);
				totalCompra = (totalValorProduto1 +  totalValorProduto2 + totalValorProduto3 + totalValorProduto4);
				System.out.println("------------------------------------");
		System.out.printf("TOTAL DA COMPRA : R$%.2f", totalCompra);
		
		scan.close();

	}

}
