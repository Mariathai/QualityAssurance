package manzano;
import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		try {
			Scanner r = new Scanner (System.in);
			System.out.println("Digite um valor para a base: ");
	        int b = r.nextInt();

	        System.out.println("Digite um valor para o expoente: ");
	        int e = r.nextInt();

	        int resultado = 1;
	        for (int i = 0; i < e; i++) {
	            resultado = resultado * b;
	        }

	        System.out.println("O resultado da potência é: " + resultado+".");

		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}

	}

}
