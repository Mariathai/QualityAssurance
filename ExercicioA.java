package manzano;

import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner (System.in);
			System.out.println("Digite um valor: ");
			int n1=sc.nextInt();
			for(int cont = 0;cont<11; cont++) {
				System.out.println(cont + "X" + n1 + "="+n1*cont);
			}
			} catch (Exception e) {
			System.out.println("Opção inválida!");
		}
		
			
		

	}
}
