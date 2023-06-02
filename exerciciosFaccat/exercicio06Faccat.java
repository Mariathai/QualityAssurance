package exerciciosFaccat;

import java.util.Scanner;

public class exercicio06Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int resultado = numero+1;
		
		System.out.println("O sucessor do número "+ numero+ " é: "+ resultado);
		
		sc.close();
		
		
		

	}

}
