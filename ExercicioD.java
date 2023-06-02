package manzano;

public class ExercicioD {

	public static void main(String[] args) {
		try {
			System.out.println("Valores inteiros e ímpares entre 1 a 20: ");
			int cont = 0;
			for (int i = 0; i < 21; i++) {
				if (i % 2 != 0) {
					cont = cont + i;
					System.out.println(cont);
				}

			}

		} catch (Exception e) {
			System.out.println("Opção inválida!");
		}

	}

}


