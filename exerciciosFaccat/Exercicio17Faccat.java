package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main (String[] args) {
		try {Scanner sc = new Scanner(System.in);
		System.out.println("Digitar a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digitar a segunda nota: ");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;

		if ((media < 0) || (media>10)) {
			System.out.println("O programa aceita somente números entre 0 e 10.");

		}else if (media>=6) {
			
			System.out.println("O aluno está aprovado!");
			System.out.println("A média é de: "+media);
			
		}
		else {
			System.out.println("O aluno foi reprovado!");
			System.out.println("A média é de: "+media);
		}
			
		} catch (Exception e) {
			System.out.println("Ei! Digite apenas valores válidos! "+e);		}
		
	}
}
