package exercicios3_java_aula_1_parte2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programaque simule as operações básicas de um caixaeletrônico (ATM).
		 * Cada operação possui suas próprias regras de validação que o programa deve 
		 * verificar antes de executar qualquer ação.
		 * O programa deve:
		 * 1. Pedir o nome do correntista
		 * 2. Pedir o saldo atual da conta
		 * 3. Exibir um menu de operações e executar aescolhausando Else-If
		 * 
		 */
		Scanner scan = new Scanner(System.in);
			
			String nome;
			String nomeCorrentista1 = "Ana Lima";
			String nomeCorrentista2 = "Carlos Oliveira";
			String nomeCorrentista3 = "Maria Souza";
			
			double saldo;
			double valorOperacao;
			int operacao;
			//boolean interruptor  = true;
			System.out.println("====================================");
			System.out.println("CAIXA ELETRONICO — JAVA");
			System.out.println("====================================");
			System.out.println("Digite seu nome:");
			nome = scan.nextLine();
			
			if(!nome.equals(nomeCorrentista1)&&!nome.equals(nomeCorrentista2)&&!nome.equals(nomeCorrentista3)) {
				System.out.println("Nome nao encontrado. Acesso negado.");
			} 
			else { 
			
				System.out.println("Digite seu saldo atual:\n");
				saldo = scan.nextDouble();
				
				do {
					//System.out.println("====================================");
					//System.out.println("CAIXA ELETRONICO — JAVA");
					//System.out.println("====================================");
					//System.out.println("Digite seu nome:");
					//System.out.println("Digite seu saldo atual:");
					System.out.printf("\rBem Vindo! %s\n \rEscolha a operacao:\n \r1 - Deposito\n \r2 - Saque\n"
							+ " \r3 - Consulta Saldo:\n \r4 - Sair\n", nome );
					operacao = scan.nextInt();
					if((operacao != 1)&&(operacao != 2)&&(operacao != 3&&(operacao != 4))){
						System.out.println("Opção inválida");}
					else { 
							if(operacao == 1){
								
							//op1
								System.out.println("Digite o valor do depósito:");
								valorOperacao = scan.nextDouble();
									if(valorOperacao <=0) {
										System.out.println("======== OPERACAO INVÁLIDA ==========\n "
												+ "O valor do deposito deve ser maior que zero.\n"
												+ "Nenhuma alteração foi realizada no saldo.\n");
									}
									else {
										saldo=valorOperacao+saldo;
										System.out.println("======== COMPROVANTE ================\n");
										System.out.printf("Operação: Deposito\n \rValor: R$ %.2f\n "
												+ "\rSaldo Anterior: R$ %.2f\n \rSaldo Atual: R$ %.2f\n"
												, valorOperacao, (saldo-valorOperacao), saldo);
										System.out.println("=====================================\n");
										//op1
									};
							}
			
							else if(operacao == 2){
							//op2
								System.out.println("Digite o valor do saque:");
								valorOperacao = scan.nextDouble();
									if(valorOperacao <=0){
											System.out.println("======== OPERACAO INVÁLIDA ==========\n "
													+ "O valor do saque deve ser maior que zero.\n"
													+ "Nenhuma alteração foi realizada no saldo.\n");
											
									} 
									else if(saldo < valorOperacao){
											//saldo=valorOperacao+saldo;
											System.out.println("======== SALDO INSUFICIENTE ================\n");
											System.out.printf("Operação: Você não possui saldo suficiente.\n "
													+ "\rSaldo disponível: R$ %.2f\n \rValor solicitado: R$ %.2f\n "
													, saldo,valorOperacao);
											System.out.println("=====================================\n");
									}else {
											saldo=saldo-valorOperacao;
											System.out.println("======== COMPROVANTE ================\n");
											System.out.printf("Operação: Saque\n \rValor: R$ %.2f\n "
													+ "\rSaldo Anterior: R$ %.2f\n \rSaldo Atual: R$ %.2f\n"
													, valorOperacao, (saldo+valorOperacao), saldo);
											System.out.println("=====================================\n");
								//op2
									}
							}
							else if(operacao == 3){
										//op3
											System.out.println("======== SALDO ================\n");
											System.out.printf("Operação: Saldo\n \rSaldo atual:R$ %.2f\n "
													, saldo);
											System.out.println("\r============================\n");
											//op3
												}
									
							}
					
					

			} while(operacao!=4);
				System.out.println("\r============================\n");
				System.out.printf("Fim! %s", nome);
				System.out.println("\r============================\n");
			}
			scan.close();
			}
			
			
}


