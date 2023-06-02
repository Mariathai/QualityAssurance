package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio28Faccat {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Digite o primeiro valor:");
			int v1 = read.nextInt();
			System.out.println("Digite o segundo valor:");
			int v2 = read.nextInt();
			System.out.println("Digite o terceiro valor:");
			int v3 = read.nextInt();
			if ((v1==v2) || (v1==v3)||(v2==v3)) {
				System.out.println("Você não pode digitar o valor mais de uma vez.");
			} else if ((v1>v2)&&(v1>v3)) {
				System.out.println(v1+"\nO primeiro valor é o maior.");
			}else if ((v2>v1)&&(v2>v3)) {
				System.out.println(v2+"\nO segundo valor é o maior.");
			}else if ((v3>v1)&&(v3>v2)) {
				System.out.println(v3+"\nO terceiro valor é o maior.");
			}
		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}
	}

}