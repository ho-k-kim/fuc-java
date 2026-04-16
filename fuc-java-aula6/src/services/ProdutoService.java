package services;

import java.util.List;

import models.Produto;

public class ProdutoService {

	public static Produto prodGenerico(String nomeProd, double valorProd, int unidadesProd) {
		Produto prod = new Produto();
		prod.setNome(nomeProd);
		prod.setValor(valorProd);
		prod.setUnidades(unidadesProd);
		return prod;
	}

	public static int contarProdutos(List<Produto> armazem) {
	
	return armazem.size();	
	
	}
	
	
	public static void exibirTodos(List<Produto> armazem) {
		
		 System.out.println("=== ARMAZEM ===");
		 for(int i=0; i<armazem.size();i++) {
			 Produto p = armazem.get(i); 
			 
			 System.out.printf("[ %d ] - %s - %,.2f %d unidades\n", (i+1), p.getNome(),p.getValor(), p.getUnidades());
		
	}

	}	
	
	
		public double calcularTotalArmazem(List<Produto>armazem) {
			double total = 0;
			for(int i=0;i<armazem.size();i++) {
				total += armazem.get(i).getValor() * armazem.get(i).getUnidades();
		 
		 }
			return total;
				 
	 }
	
}
