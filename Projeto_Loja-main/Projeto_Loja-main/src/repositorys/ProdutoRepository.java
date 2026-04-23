package repositorys;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

/**
 * Classe responsável por simular um banco de dados em memória.
 * Utiliza o padrão Repository para centralizar o acesso aos dados.
 */
public class ProdutoRepository {

	/**
	 * Lista estática que armazena todos os produtos da aplicação.
	 * Por ser estática, todos os objetos compartilham a mesma lista (simulando uma tabela).
	 */
	public static List<Produto> armazem = new ArrayList<>();
}
