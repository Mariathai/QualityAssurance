package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio27Faccat {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Digite um número inteiro: ");
			int n1 = read.nextInt();
			if (n1==0) {
				System.out.println("Você digitou 0!");
				
			} else if (n1>0) {
				System.out.println("Esse número é positivo.");
			} else {
				System.out.println("Esse número é negativo.");
			}
			
		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}

			}

		}
