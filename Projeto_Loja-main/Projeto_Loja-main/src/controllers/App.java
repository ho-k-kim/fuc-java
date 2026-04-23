package controllers;

import estoques.ProdutoEstoque;
import menus.Inicial;

/**
 * Classe principal que inicia a aplicação.
 * Funciona como o ponto de entrada (Entry Point) do programa.
 */
public class App {

	public static void main(String[] args) {
		
		// Inicializa o estoque com dados pré-definidos (Seed)
		ProdutoEstoque bancoDados = new ProdutoEstoque();
		bancoDados.uploadEstoque();
		
		// Inicia a interface de menu para o usuário
		Inicial menuInicial = new Inicial();
		menuInicial.showMenu();
	}
}
