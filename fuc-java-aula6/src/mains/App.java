package mains;
	import java.util.ArrayList;
import java.util.List;

import models.Produto;
import services.ProdutoService;
public class App {

	public static void main(String[] args) {
		
		/* EXERCÍCIO 2 — Instanciar Produto na Main e Preencher com Setters
		
		System.out.println("=== PRODUTOS CADASTRADOS ===");
		Produto prodGenerico = new Produto(); 
		prodGenerico.setNome("Mesa de Escritório ");
		prodGenerico.setValor(250.50);
		prodGenerico.setUnidades(50);
		System.out.printf("Produto: %s |Valor: R$ %,.2f |Unidades: %d\n", prodGenerico.getNome(),prodGenerico.getValor(), prodGenerico.getUnidade() );

		prodGenerico.setNome(" Cadeira de Escritório ");
		prodGenerico.setValor(298.80 );
		prodGenerico.setUnidades(120);
		System.out.printf("Produto: %s |Valor: R$ %,.2f |Unidades: %d\n", prodGenerico.getNome(),prodGenerico.getValor(), prodGenerico.getUnidade() );

		prodGenerico.setNome(" Notebook ");
		prodGenerico.setValor(2500.00);
		prodGenerico.setUnidades(30);
		System.out.printf("Produto: %s |Valor: R$ %,.2f |Unidades: %d\n", prodGenerico.getNome(),prodGenerico.getValor(), prodGenerico.getUnidade() );
		
		*/
		 // EXERCÍCIO 3 — Criar a Lista Armazem e Popular com Produtos
		
		 List<Produto> armazem = new ArrayList<>();
		 Produto prodGenerico = new Produto(); 
		 ProdutoService funcProd = new ProdutoService();
		 
//		 public static List<Produto> uploadEstoque() {
		//		List<Produto> armazem = new ArrayList<>();
	//			ProdutoService funcProd = new ProdutoService();
				armazem.add(funcProd.prodGenerico("Mesa de Escritório", 250.50, 50));
				armazem.add(funcProd.prodGenerico("Cadeira de Escritório", 298.80, 120));
				armazem.add(funcProd.prodGenerico("Notebook", 2500.00, 30));
//				return armazem;
	//		}
		//uploadEstoque;
		
		 System.out.println("=== ARMAZEM ===");
		 for(int i=0; i<armazem.size();i++) {
			 Produto p = armazem.get(i); 
			 
			 System.out.printf("[ %d ] - %s - %,.2f %d unidades\n", (i+1), p.getNome(),p.getValor(), p.getUnidades());
			 
		}
		System.out.println("\nTotal de itens no Armazem: "+armazem.size()); 
		
		//EXERCÍCIO 4 — Criar ProdutoService — Contar e Mostrar Produtos
		System.out.println("funcsProd.exibirTodos(armazem) ->\n");funcProd.exibirTodos(armazem);
		System.out.println("funcsProd.contarProdutos(armazem) -> "+funcProd.contarProdutos(armazem));
		
		//EXERCÍCIO 5 — Service — Calcular Valor Total do Armazem
		System.out.printf("VALOR TOTAL DO ARMAZEM: R$ %,.2f",funcProd.calcularTotalArmazem(armazem));
			
		
		 }
		 
	}

	
	

