package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio07Faccat {


		public static void main(String[] args) {
			
			Scanner read = new Scanner (System.in);
			System.out.println("Digite sua idade em anos: ");
			int respanos=read.nextInt();
			System.out.println("Digite os meses restantes:");
			int respmeses=read.nextInt();
			System.out.println("Digite os meses restantes:");
			int respdias=read.nextInt();
			int anosemdias=respanos*365;
			int mesesemdias=respmeses*30;
			int diasemdias=anosemdias+mesesemdias+respdias;
			System.out.println("Você tem "+diasemdias+" dias de idade.");
		

		}
}


