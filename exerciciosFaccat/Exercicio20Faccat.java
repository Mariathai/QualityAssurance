package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio20Faccat {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o primeiro valor: ");
			int valor1= sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			int valor2= sc.nextInt();
			
			if (valor1 == valor2) {
				System.out.println("Opção inválida!");	
			}else if (valor1 > valor2) {
				System.out.println(valor2+ " e "+valor1);
				
			}else {
				System.out.println(valor1+ " e "+ valor2);
				}
				
			} catch (Exception e) {
				System.out.println("Valor inválido!!");
			}
		}

	}


