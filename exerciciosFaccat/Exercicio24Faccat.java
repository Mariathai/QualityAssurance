package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio24Faccat{

public static void main(String[] args) {
	try {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o salário fixo do funcionário:");
		double salariofixo = read.nextDouble();
		System.out.println("Digite o valor das vendas efetuadas:");
		double valorvendas = read.nextDouble();

		if (valorvendas <= 1500.0) {
			double comissao = valorvendas * 0.03;
			double resultado = comissao + salariofixo;
			System.out.println("O valor final é de R$" + resultado + " reais.");

		} else if (valorvendas > 1500.0) {
			double valorpass = valorvendas - 1500.0;
			double comissao = 45;
			double comissao2 = valorpass * 0.05;
			double resultado = comissao + comissao2 + salariofixo;
			System.out.println("O valor final é de R$" + resultado + " reais.");
		}
	} catch (Exception e) {
		System.out.println("Opção inválida!");
	}

}

}