package energia;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner(System.in);
			
			double faixa1 = 0;
			double faixa2 = 0;
			double faixa3 = 0;
			double faixa4 = 0;
			
			double valorFaixa1 = 0.45;
			double valorFaixa2 = 0.62;
			double valorFaixa3 = 0.85;
			double valorFaixa4 = 1.1;
			
			int consumo;
			int diasAtraso;
			double subTotal;
			double valorTotal;
			
			double multa = 0;
			double juros = 0;
			double taxaCorte = 0;
			
			double valorMulta1 = 0.02;
			double valorMulta2 = 0.01;
			
			System.out.println("=======Calculadora de Energia Elétrica========");
			System.out.println("Digite o consumo do mes em kWh:");
			consumo = scan.nextInt();
			System.out.println("Digite os dias de atraso:");
			diasAtraso = scan.nextInt();
			
			if (consumo <= 100 && consumo > 0) {
				faixa1 = consumo * valorFaixa1;
			} else if (consumo <= 200) {
				faixa1 = 100 * valorFaixa1;
				faixa2 = (consumo -100) * valorFaixa2;
			} else if (consumo <= 350) {
				faixa1 = 100 * valorFaixa1;
				faixa2 = 100 * valorFaixa2;
				faixa3 = (consumo - 200) * valorFaixa3;
			} else if (consumo >351 ){
				faixa1 = 100 * valorFaixa1;
				faixa2 = 100 * valorFaixa2;
				faixa3 = 100 * valorFaixa3;
				faixa4 = (consumo - 350) * valorFaixa4;
			} else if (consumo == 0) {
				faixa1 = 0;
				faixa2 = 0;
				faixa3 = 0;
				faixa4 = 0;
			} else {
				System.out.println("Valor de consumo inválido");
			}
			subTotal = faixa1 + faixa2 + faixa3 + faixa4;
			
			if (diasAtraso >= 1 && diasAtraso <=30) {
				multa = subTotal * valorMulta1;
				
			} else if (diasAtraso>=31 && diasAtraso <=60) {
				
				multa = subTotal * valorMulta1;
				juros = subTotal * valorMulta2;
				
			} else if (diasAtraso >61) {
				multa = subTotal * valorMulta1;
				juros = subTotal * valorMulta2;
				taxaCorte = 80;
				
			} else if (diasAtraso == 0) {
				multa = 0;
				juros = 0;
				taxaCorte = 0;
				
			} else {
				System.out.println("Valor de dias inválido");
			}
			valorTotal = subTotal + multa + juros + taxaCorte;
			
			
			System.out.println("O valor de sua Conta de Energia foi :");
			System.out.printf("R$ %.2f",valorTotal );
			
			scan.close();

	}

}
