package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		
		try {
			
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de maçãs compradas: ");
		int macas = sc.nextInt();

		if (macas < 1) {
			System.out.println("Digite um número de maçãs válido! ");
		} else if (macas < 12) {
			double resultado=macas*1;
			System.out.println("O valor a ser pago é: R$" + resultado);

		} else {
			double total = macas * 1;
			System.out.println("O valor a ser pago é: R$" + total);
		}
sc.close();
		} catch (Exception e) {
			System.out.println("Digite somente números inteiros!"+e);
		}
		}

}
