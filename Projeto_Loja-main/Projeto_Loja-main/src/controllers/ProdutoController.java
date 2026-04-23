package controllers;

import java.util.Scanner;
import models.Produto;
import services.ProdutoService;

/**
 * Controller responsável por intermediar a interação do usuário com a lógica de produtos.
 * Captura entradas do teclado e envia solicitações para o Service.
 */
public class ProdutoController {
	
	/**
	 * Fluxo para criação de um novo produto.
	 */
	public static void createProdController() {
		Scanner scan = new Scanner(System.in);
		ProdutoService funcProd = new ProdutoService();
		
		String nome;
		double valor;
		int unidades;
		String descricao;
		boolean conf;

		System.out.println("== Criando um Produto ==");
		System.out.print("Digite o nome do produto: ");
		nome = scan.nextLine();
		
		System.out.print("Digite o valor do Produto: ");
		valor = scan.nextDouble();
		
		System.out.print("Digite o numero de unidades do produto: ");
		unidades = scan.nextInt();
		scan.nextLine(); // Limpa o buffer do teclado
		
		System.out.print("Digite a descrição do Produto: ");
		descricao = scan.nextLine();

		// Envia os dados para a camada de serviço processar
		conf = funcProd.createProd(nome, valor, unidades, descricao);
		
		if (conf) {
			System.out.println("Produto gerado com sucesso!!");
		} else {
			System.out.println("Falha ao gerar o Produto");
		}
		
		// Nota: Não fechamos o Scanner aqui para não fechar o System.in global.
	}
	
	/**
	 * Exibe no console todos os produtos cadastrados.
	 */
	public static void listAllProdController(){
		ProdutoService funcProd = new ProdutoService();
		System.out.println("== Lista de Produtos (Nomes) ==");
		System.out.println(funcProd.listAll());
	}
	
	/**
	 * Fluxo para remoção de um produto por ID.
	 */
	public static void removeProdController() {
		Scanner scan = new Scanner(System.in);
		ProdutoService funcProd = new ProdutoService();
		int idP;

		System.out.print("Digite o Id do produto que você quer apagar: ");
		idP = scan.nextInt();
		
		// Solicita a remoção via serviço
		funcProd.deleteProd(idP);
		System.out.println("Operação de remoção concluída.");
	}
	
	/**
	 * Fluxo para encontrar um produto específico por ID.
	 */
	public static void findByIdProdController() {
		Scanner scan = new Scanner(System.in);
		ProdutoService funcProd = new ProdutoService();
		int idP;
		Produto prodFind;

		System.out.print("Digite o Id do produto que você quer encontrar: ");
		idP = scan.nextInt();
		
		prodFind = funcProd.findById(idP);
		
		if (prodFind != null) {
			System.out.println("Produto encontrado:");
			System.out.println(prodFind);
		} else {
			System.out.println("Produto com ID " + idP + " não encontrado.");
		}
	}
}
