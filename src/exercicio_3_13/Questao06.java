package exercicio_3_13;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * int y = 0; int z = 1;
		 * 
		 * while (y + z < 100) { System.out.print(" " + y); z += y; System.out.print(" "
		 * + z); y += z; }
		 */
		int anterior = 0;
		int atual = 1;
		
		while (atual < 100) {
			
			System.out.println(atual);
			
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		
		System.out.println(atual);

	}

}
