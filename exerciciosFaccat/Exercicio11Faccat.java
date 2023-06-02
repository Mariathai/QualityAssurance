package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio11Faccat {

	public static void main(String[] args) {
		
Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, escreva o total de carros vendidos pelo colaborador:");
		int nc = read.nextInt();
		System.out.println("Agora, escreva o valor total das vendas do colaborador:");
		double tv = read.nextDouble();
		System.out.println("Agora, escreva o valor do salário fixo do colaborador:");
		double sf = read.nextDouble();
		System.out.println("Qual o valor recebido por carro vendido?");
		double vpc = read.nextDouble();
		double ppv = tv*0.05;
		double cvc = nc*vpc;
		double nf = sf+ppv+cvc;
		System.out.println("O salário final do colaborador é de R$"+nf+".");
	}

}
