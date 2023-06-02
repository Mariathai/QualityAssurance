package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio31Faccat {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Digite o valor do lado A:");
			int a = read.nextInt();
			System.out.println("Digite o valor do lado B:");
			int b = read.nextInt();
			System.out.println("Digite o valor do lado C:");
			int c = read.nextInt();
			if ((a < b + c) && (b < a + c) && (c < a + b)) {
				System.out.println("Forma um triângulo.");
			} else {
				System.out.println("Não forma um triângulo.");
			}
			
		} catch (Exception e) {
			System.out.println("Opção inválida");
		}
	}

}
