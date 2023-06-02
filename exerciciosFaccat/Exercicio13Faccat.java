package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio13Faccat {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		System.out.println("Digite o valor da primeira nota:");
		int n1=read.nextInt();
		System.out.println("Agora, digite o valor da segunda nota:");
		int n2=read.nextInt();
		System.out.println("Ok,agora preciso do valor da terceira nota:");
		int n3=read.nextInt();
		int nf=(n1*2+n2*3+n3*5)/10;
		System.out.println("A nota final do aluno é "+nf+".");
	}

}