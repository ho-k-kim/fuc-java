package menus;

import java.util.Scanner;
import controllers.ProdutoController;

/**
 * Interface de Usuário via Console (CLI).
 * Gerencia a exibição do menu e as escolhas do usuário.
 */
public class Inicial {
	
	/**
	 * Exibe o menu principal em um loop infinito até que o programa seja encerrado.
	 */
	public static void showMenu() {
		Scanner scan = new Scanner(System.in);
		ProdutoController contProd = new ProdutoController();
		int escolha;
		
		// Loop While True: Mantém o programa rodando até o usuário fechar o console ou implementarmos uma saída
		while(true) {
			
			System.out.println("\n====== Menu de Gestão de Loja ======");
			System.out.println("1 - Ver Armazem (Lista de Nomes)");
			System.out.println("2 - Adicionar Produto");
			System.out.println("3 - Remover Produto por ID");
			System.out.println("4 - Procurar Produto por ID");
			System.out.println("0 - Sair");
			System.out.print("Sua escolha: ");
			
			escolha = scan.nextInt();
			
			// Switch case para direcionar a ação baseada na escolha numérica
			switch(escolha) {
				case 1:
					// Chama o controlador para listar produtos
					contProd.listAllProdController();
					break;
				case 2:
					// Chama o controlador para criar produto
					contProd.createProdController();
					break;
				case 3:
					// Chama o controlador para remover produto
					contProd.removeProdController();
					break;
				case 4:
					// Chama o controlador para buscar produto específico
					contProd.findByIdProdController();
					break;
				case 0:
					System.out.println("Saindo do sistema... Até logo!");
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
					break;
			}
		}
	}
}
