package exercicios18_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia nomes e notas de 6 alunos em duas listas paralelas. Percorra as
		 *  listas e monte uma terceira — aprovados — adicionando apenas nomes com nota >= 6.0. Exiba as três listas.
		 */
		Scanner scan = new Scanner(System.in);
		
		List <String> alunos = new ArrayList<>();
		List <Double> notas = new ArrayList<>();
		List <String> aprovados = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			
			System.out.println("Digite o nome do aluno" +(i+1)+":");
			alunos.add(scan.nextLine());
			System.out.println("Digite a nota :");
			notas.add(Double.parseDouble(scan.next()));scan.nextLine();
			if(notas.get(i)>=6.00) {
				aprovados.add(alunos.get(i));
			}
			
			
			
		}
		System.out.println("Todos :"+alunos);
		if(aprovados.isEmpty()==true) {
			System.out.println("Não houve aprovados!");
		}else {
			System.out.println("Aprovados :"+aprovados);
		}
		
		System.out.println("Reprovados :"+(alunos.size()-aprovados.size())+" alunos");
		
		
		scan.close();
		
		
		
		
		
		

	}

}
