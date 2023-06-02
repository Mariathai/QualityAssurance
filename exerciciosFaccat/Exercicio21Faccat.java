package exerciciosFaccat;

import java.util.Scanner;
public class Exercicio21Faccat {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o horário inicial da partida de xadrez: ");
		int Horainicio=sc.nextInt();
		System.out.println("Digite o horário final da partida de xadrez: ");
		int Horafinal=sc.nextInt();
		int quantidadehorasjogadas=Horafinal-Horainicio;
		if(quantidadehorasjogadas<0) {
			quantidadehorasjogadas=quantidadehorasjogadas+24;
			System.out.println("A quantidade de horas jogadas corresponde a: "+ quantidadehorasjogadas + "horas");
			
		}
		else if (quantidadehorasjogadas == 0) {
			System.out.println("A quantidade de horas jogadas corresponde a: " + quantidadehorasjogadas);
		} else {
			System.out.println("A quantidade de horas jogadas corresponde a: " + quantidadehorasjogadas);
		}
	}}