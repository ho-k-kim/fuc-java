package exercicios11_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa de lista de compras. Use um while para permitir que o 
		 * usuário adicione itens digitando o nome. Quando digitar 'fim', o loop encerra.
		 *  Após o loop, exiba todos os itens,o total e pergunte se deseja remover algum.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		List<String> listaCompras = new ArrayList<>();
		String item = "";
		while(!item.equals("fim")) {
			System.out.println("Digite o item a adicionar na lista ( digitem fim para encerrar):");
			item = scan.nextLine();
			if(!item.equals("fim")) {
				listaCompras.add(item);
			}else {
				System.out.println("== LISTA DE COMPRAS ==");
				for(int i=0; i<(listaCompras.size());i++) {
					System.out.println((i+1)+" - "+ listaCompras.get(i));
					
				}
			}
			
		}
		
		/*System.out.println("== LISTA DE COMPRAS ==");
		for(int i=0; i<(listaCompras.size());i++) {
			System.out.println((i+1)+" - "+ listaCompras.get(i));
			
		}*/
		System.out.println("\nTotal :" + (listaCompras.size())+"\n");
		System.out.println("Deseja Remover algum item? :");
		item = scan.nextLine();
		while(listaCompras.contains(item)) {
			listaCompras.remove(item);
			System.out.println("\n===============================");
			System.out.println("\n"+item + " - Removido com sucesso!\n");
		}
			System.out.println("== LISTA DE COMPRAS FINAL==\n");
			for(int i=0; i<listaCompras.size();i++) {
			System.out.println((i+1) +" - "+ listaCompras.get(i));
		}
			System.out.println("\nTotal :" + (listaCompras.size())+"\n");		
		
		
		
		scan.close();

	}

}
