package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10Faccat {

	public static void main(String[] args) {
		 
Scanner read=new Scanner (System.in);
	System.out.println("Informe o custo de fábrica do veículo:");
	float ve = read.nextFloat();
	double vimpd= ve*0.28;
	double imp = ve*0.45;
	double vf = vimpd+imp+ve;
	System.out.println("O custo final desse veículo é de R$"+vf+".");
	System.out.println("Custo do distribuidor: R$"+vimpd+".");
	System.out.println("Custo de impostos: R$"+imp+".");
	
	}

}
