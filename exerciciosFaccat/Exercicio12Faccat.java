package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio12Faccat {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		System.out.println(" Escreva a temperatura em graus Fahrenheit: (por favor, digite apenas números!)");
		double tf = read.nextDouble();
		double tc = ((tf-32)/9)*5;
		System.out.println("A temperatura de graus Celsius é de "+tc+".");
	}

}