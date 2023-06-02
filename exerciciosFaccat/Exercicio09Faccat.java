package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de seu salário atual: ");
		double salario = sc.nextDouble();
		System.out.println("Digite o valor da porcentagem de reajuste: ");
		double reajuste = sc.nextDouble();
		
		double novosalario = reajuste*salario/100;
		double salarioFinal = salario +novosalario;
		
		System.out.println("O valor do reajuste é:  R$"+novosalario);
		System.out.println("O novo salário com reajuste é: R$"+salarioFinal);
		sc.close();
		
	}
}
