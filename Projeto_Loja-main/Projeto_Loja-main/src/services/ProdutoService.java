package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import models.Produto;
import repositorys.ProdutoRepository;

/**
 * Classe de Serviço (Service Layer) que contém a lógica de negócio da aplicação.
 * Faz a ponte entre os controladores e o repositório.
 */
public class ProdutoService {

	/**
	 * Calcula o valor total financeiro de um produto.
	 */
	public static double valorPorProduto(Produto prod) {
		double valor;
		valor = prod.getValor() * prod.getUnidades();
		return valor;
	}

	/**
	 * Cria e adiciona um novo produto ao repositório.
	 * @return true se criado com sucesso
	 */
	public static boolean createProd(String nomeProd, double valorProd, int unidadesProd, String descricaoProd) {
		Produto prod = new Produto();
		ProdutoRepository armazemData = new ProdutoRepository();
		
		prod.setNome(nomeProd);
		prod.setValor(valorProd);
		prod.setUnidades(unidadesProd);
		prod.setDescricao(descricaoProd);
		
		// Acesso ao atributo estático do repositório via instância
		armazemData.armazem.add(prod);
		
		return true;
	}
	

	
	
	
	
	
	
	/**
	 * Retorna uma lista contendo apenas os nomes dos produtos cadastrados.
	 * @return Lista de Strings com nomes
	 */
	public static List<String> listAll() {
		ProdutoRepository armazemData = new ProdutoRepository();
		List<String> nomesProd = new ArrayList<>();

		// Percorre o repositório para extrair os nomes
		for (int i = 0; i < armazemData.armazem.size(); i++) {
			nomesProd.add(armazemData.armazem.get(i).getNome());
		}
		return nomesProd;
	}
	
	/**
	 * Remove um produto do repositório baseado no seu ID.
	 * @param idP ID do produto a ser deletado
	 */
	public static void deleteProd(int idP) {
		ProdutoRepository armazemData = new ProdutoRepository();
		for (int i = 0; i < armazemData.armazem.size(); i++) {
			// Compara o ID de cada produto com o ID buscado
			if (armazemData.armazem.get(i).getID() == idP) {
				armazemData.armazem.remove(i);
				return; // Encerra a busca após encontrar e remover
			}
		}
	}
	
	/**
	 * Busca um produto específico pelo seu ID.
	 * @param idP ID do produto
	 * @return Objeto Produto ou null caso não encontrado
	 */
	public static Produto findById(int idP) {
		ProdutoRepository armazemData = new ProdutoRepository();
		
		for (int i = 0; i < armazemData.armazem.size(); i++) {
			if (armazemData.armazem.get(i).getID() == idP) {
				return armazemData.armazem.get(i);
			}
		}
		return null;
	}
	
	
	

}