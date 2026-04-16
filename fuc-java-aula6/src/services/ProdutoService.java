package services;

import models.Produto;

public class ProdutoService {

	public static Produto prodGenerico(String nomeProd, double valorProd, int unidadesProd) {
		Produto prod = new Produto();
		prod.setNome(nomeProd);
		prod.setValor(valorProd);
		prod.setUnidades(unidadesProd);
		return prod;
	}
	
	
}
