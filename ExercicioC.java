package manzano;

public class ExercicioC {
	
		public static void main(String[] args) {
			try {
				System.out.println("Soma dos números pares entre 1 e 500: ");
				int cont = 0;
				for(int i = 0;i<501;i++) {
					if (i%2==0) {
						cont=cont+i;
						System.out.println(cont);
					}
					
				}
				
			} catch (Exception e) {
				System.out.println("Opção inválida!");
			}

		}

	}
