package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio35Faccat {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			double precogasosa=3.30, precoalcool= 2.90;
			
			System.out.println("Por gentileza, escreva quantos litros de combustível foram utilizados:");
			double quantcombust = read.nextDouble();
			System.out.println("Agora digite A se o combustível utilizado foi álcool, e G se foi gasolina.");
			char tipocomb = read.next().charAt(0);
			if ((tipocomb=='a')|| (tipocomb=='A')) {	
				if (quantcombust<=20) {
					double valortotal = quantcombust * precoalcool * 0.97;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				} else {
					double valortotal = quantcombust * precoalcool * 0.95;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
					}
			} else if((tipocomb=='g')|| (tipocomb=='G')) {
				if(quantcombust<=20) {
					double valortotal = quantcombust * precogasosa * 0.96;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				} else {
					double valortotal = quantcombust * precogasosa * 0.94;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				}
				
			} else {
				System.out.println("Tipo de combustível inválido.");
			}
				
			
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, reinicie o programa e digite valores válidos!");
		}

	}

}