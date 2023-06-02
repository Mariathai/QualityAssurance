package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {
		
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int A = read.nextInt();
			System.out.println("Digite um número: ");
			int B = read.nextInt();

			if (A == B) {
				System.out.println("Os números não podem ser iguais!");

			} else if (A > B) {
				System.out.println(A+ " é o maior número.");
			}

			else if (B > A) {
				System.out.println(B+" é o maior número.");

			} else {

			}
			
		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}
				
	}

}
