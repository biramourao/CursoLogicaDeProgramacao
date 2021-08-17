package exercicio_3_13;

public class Questao02 {
	
	public static void main(String[] args) {

		int soma = 0; //variavel

		for (int i = 1; i <= 1000; i++) {
			
			System.out.print(soma + " + " );
			
			soma = soma + i;
			
			System.out.println(i + " = " + soma);
			
		}
	}
}
