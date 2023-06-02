package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio32Faccat {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Por gentileza, escreva o nome do primeiro time:");
			String time1 = read.next();
			System.out.println("Agora escreva quantos gols o primeiro time marcou:");
			int golstime1 = read.nextInt();
			System.out.println("Por gentileza, escreva o nome do segundo time:");
			String time2 = read.next();
			System.out.println("Agora escreva quantos gols o segundo time marcou:");
			int golstime2 = read.nextInt();
			if (golstime1 > golstime2) {
				System.out.println("O time " + time1 + " ganhou!");
			} else if (golstime2 > golstime1) {
				System.out.println("O time " + time2 + " ganhou!");
			} else {
				System.out.println("Empate!");
			}
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, escreva um valor válido!"+e);
		}

	}

}