package exercicio_3_13;

import java.math.BigInteger;

public class Questao04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {

			Long num = i;

			for (Long j = (num - 1); j >= 1; j--) {
				
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
