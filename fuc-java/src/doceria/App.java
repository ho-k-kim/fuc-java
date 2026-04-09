package doceria;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);

		int qtdBrigadeiro;
		int qtdBeijinho;
		int qtdTrufasChocolate;
		int qtdBoloPote;

		double valorBrigadeiro;
		double valorBeijinho;
		double valorTrufasChocolate;
		double valorBoloPote;

		int escolhaDeProduto;
		int qtdProduto;

		int qtdCompraBrigadeiro=0;
		int qtdCompraBeijinho=0;
		int qtdCompraTrufasChocolate=0;
		int qtdCompraBoloPote=0;
		
		double valorTotal;

		System.out.println("======Estoque======");
		System.out.println("Digite a quantidade de Brigadeiros: ");
		qtdBrigadeiro = scan.nextInt();
		System.out.println("Digite a quantidade de Beijinhos: ");
		qtdBeijinho = scan.nextInt();
		System.out.println("Digite a quantidade de Trufas de Chocolate: ");
		qtdTrufasChocolate = scan.nextInt();
		System.out.println("Digite a quantidade de Bolo de Pote: ");
		qtdBoloPote = scan.nextInt();
		System.out.println("======Valores======");

		System.out.println("Digite o valor um Brigadeiro: ");
		valorBrigadeiro = scan.nextDouble();
		System.out.println("Digite o valor um Beijinhos: ");
		valorBeijinho = scan.nextDouble();
		System.out.println("Digite o valor um Trufas de Chocolate: ");
		valorTrufasChocolate = scan.nextDouble();
		System.out.println("Digite o valor um Bolo de Pote: ");
		valorBoloPote = scan.nextDouble();

		System.out.println("=======Cliente=====");

		
		System.out.println(" 1-Brigadeiro \n 2-Beijinhos \n 3-Trufas de Chocolate \n 4-Bolo de Pote");
		System.out.println("Digite qual dos produtos você vai querer");
		escolhaDeProduto = scan.nextInt();

		/*
		 * V && V == V 
		 * F && V == F 
		 * V && F == F 
		 * F && F == F
		 * 
		 * V || V == V 
		 * F || V == V 
		 * V || F == V 
		 * F || F == F
		 */

		switch (escolhaDeProduto) {
		case 1:

			System.out.println("O produto escolhido foi Brigadeiro");
			System.out.printf("valor do brigadeiro: R$ %.2f \n", valorBrigadeiro);
			System.out.println("Quantos brigadeiros você quer comprar:");
			qtdProduto = scan.nextInt();
			if ((qtdProduto <= qtdBrigadeiro) && (qtdProduto >= 1)) {
				System.out.printf("==Foi adicionado %d brigaderios ao seu carrinho \n", qtdProduto);
				qtdCompraBrigadeiro = qtdProduto;
			} else {

				System.out.println("Quantidade inválido");
			}

			break;

		case 2:
			System.out.println("O produto escolhido foi Beijinho");
			System.out.printf("valor do Beijinhois R$ %.2f \n", valorBeijinho);
			System.out.println("Quantos Beijinhos você quer comprar:");
			qtdProduto = scan.nextInt();
			if ((qtdProduto <= qtdBeijinho) && (qtdProduto >= 1)) {
				System.out.printf("==Foi adicionado %d brigaderios ao seu carrinho \n", qtdProduto);
				qtdCompraBeijinho = qtdProduto;
			} else {
				System.out.println("Quantidade inválido");
			}
			break;
		case 3:
			System.out.println("O produto escolhido foi Trufas de Chocolate");
			System.out.printf("valor do Trufas de Chocolate R$ %.2f \n", valorTrufasChocolate);
			System.out.println("Quantos Trufas de Chocolate você quer comprar:");
			qtdProduto = scan.nextInt();
			if ((qtdProduto <= qtdTrufasChocolate) && (qtdProduto >= 1)) {
				System.out.printf("==Foi adicionado %d brigaderios ao seu carrinho \n", qtdProduto);
				qtdCompraTrufasChocolate = qtdProduto;
			} else {
				System.out.println("Quantidade inválido");
			}
			break;
		case 4:
			System.out.println("O produto escolhido foi Bolo de Pote");
			System.out.printf("valor do Bolo de Pote R$ %.2f \n", valorBoloPote);
			System.out.println("Quantos Bolo de Pote você quer comprar:");
			qtdProduto = scan.nextInt();
			if ((qtdProduto <= qtdBoloPote) && (qtdProduto >= 1)) {
				System.out.printf("==Foi adicionado %d brigaderios ao seu carrinho \n", qtdProduto);
				qtdCompraBoloPote = qtdProduto;
			} else {
				System.out.println("Quantidade inválido");
			}
			break;
		default:
			System.out.println("opção inválida");
			break;
		}
		
		System.out.println("=======Recibo=======");
		System.out.printf("Brigadeiro--------------X %d  =  %.2f \n",qtdCompraBrigadeiro, (qtdCompraBrigadeiro * valorBrigadeiro));
		System.out.printf("Beijinho----------------X %d  =  %.2f \n",qtdCompraBeijinho,(qtdCompraBeijinho * valorBeijinho));
		System.out.printf("Trufa de Chocolate------X %d  =  %.2f \n",qtdCompraTrufasChocolate,(qtdCompraTrufasChocolate * valorTrufasChocolate));
		System.out.printf("Bolo de Pote------------X %d  =  %.2f \n",qtdCompraBoloPote,(qtdCompraBoloPote * valorBoloPote));
		
		System.out.println("----------------------------");
		
		valorTotal = (qtdCompraBrigadeiro * valorBrigadeiro) + (qtdCompraBeijinho * valorBeijinho) + (qtdCompraTrufasChocolate * valorTrufasChocolate) + (qtdCompraBoloPote * valorBoloPote); 
		
		System.out.printf("Valor total: R$ %.2f \n",valorTotal);
		
		scan.close();

	}

}
