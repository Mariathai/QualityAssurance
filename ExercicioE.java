package manzano;

public class ExercicioE {

	public static void main(String[] args) {
		try {
			int resp = 1;
			System.out.println("Apresentando o resultado das potências de 3, do expoente 0 ao 15:");
			System.out.println("3 elevado a 0 é igual a "+resp+".");
			
			for (int i = 1; i < 16; i++) {
				resp = resp * 3;
				System.out.println("3 elevado a " + i + " é igual a " + resp+ ".");
			}

		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}

	}

}