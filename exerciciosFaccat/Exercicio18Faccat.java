package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
		
		try {
			Scanner sc= new Scanner(System.in);
			int anoAtual, anoNasc, cont;
			System.out.println("Digite seu ano de nascimento: ");
			anoNasc=sc.nextInt();
			System.out.println("Digite o ano atual: ");
			anoAtual=sc.nextInt();
			cont= anoAtual-anoNasc;
			
			if (cont>=18) {
				System.out.println("Você está apto a votar!");
				
			} else {
				System.out.println("Você não pode votar!");

			}
			
		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}
	}

}
