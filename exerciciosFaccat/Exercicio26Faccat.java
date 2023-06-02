package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio26Faccat {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Digite a quantidade atual: ");
			int QuantidadeAtual=sc.nextInt();
			System.out.println("Digite a quantidade máxima: ");
			int QuantidadeMaxima=sc.nextInt();
			System.out.println("Digite a quantidade mínima: ");
			int QuantidadeMinima=sc.nextInt();
			
		 int Quantidademedia=(QuantidadeMaxima+QuantidadeMinima)/2;
		 
		 if (QuantidadeAtual>=Quantidademedia) {
			 System.out.println("Não efetuar a compra!");
			
		} else { 
			System.out.println("Efetuar a compra!");

		}
		
	} catch (Exception e) {
		System.out.println("Opção inválida!!");
	}
	 
		}
		
	
		

	}


