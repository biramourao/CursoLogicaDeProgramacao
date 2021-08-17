package exercicio_3_13;

public class Questao05 {

	public static void main(String[] args) {
		
		  for (long i = 1; i <= 21; i++) { 
			  
			  long num = i;
		  
			  for (long j = (num - 1); j >= 1; j--) { 
				  num *= j; 
			  }
		  
			  System.out.println("Fatorial de " + i + " = " + num);
		  
		  }
		 
		/*
		 * int fatorial = 1; for (int n = 1; n <= 10; n++) { fatorial = fatorial * n;
		 * System.out.println("fat(" + n + ") = " + fatorial); }
		 */

	}

}
