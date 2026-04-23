package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		for (int i = 0; i < armazem.size(); i++) {
			Produto p = armazem.get(i);

			System.out.printf("[ %d ] - %s - %,.2f %d unidades\n", (i + 1), p.getNome(), p.getValor(), p.getUnidades());

		}

	}

	public double calcularTotalArmazem(List<Produto> armazem) {
		double total = 0;
		for (int i = 0; i < armazem.size(); i++) {
			total += armazem.get(i).getValor() * armazem.get(i).getUnidades();

		}
		System.out.printf("Total: R$ %,.2f%n", total);
		return total;

	}

	public Produto buscarPorNome(List<Produto> armazem) {
		String nomeBusca;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o produto busca:");
		nomeBusca = scan.nextLine();
		int i = 0;
		while (i < armazem.size()) {
			if (armazem.get(i).getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.println(armazem.get(i).getNome());
				return armazem.get(i);
			}
			{
				i++;
			}
			scan.close();
		}
		return null;
	}

	public List<Produto> filtrarAcimaDe(List<Produto> armazem, double limiteValor) {
		List<Produto> filtrados = new ArrayList<>();
		for (int i = 0; i < armazem.size(); i++) {
			if (armazem.get(i).getValor() > limiteValor) {
				filtrados.add(armazem.get(i));
			}

		}
		System.out.printf("Filtrar produtos acima de: R$ %.2f\n", limiteValor);
		System.out.println("Produtos encontrados: " + filtrados.size());

		for (int i = 0; i < filtrados.size(); i++) {
			System.out.printf("%s |R$%.2f |%d unidades\n", filtrados.get(i).getNome(), filtrados.get(i).getValor(),
					filtrados.get(i).getUnidades());
		}

		return filtrados;

	}
	
	/*public String classificarProduto(Produto prod) {
		List <Produto> armazem = new ArrayList<>();
		
		armazem.get(0).getValor();
		return armazem.get(0).getValor();
		
			
		
	int faixa= (prod < 20) ? 1 : (prod < 100) ? 2 : (prod < 500) ? 3 : 4;
	
	
	switch (faixa) {
	case 1: 
		
		return "Economico";
	
	case 2: 
		
		return "Intermediario";
		
	
	case 3: 
		
		return "Luxo";
		
	
	default:
		;
	}
	
	}*/
}
