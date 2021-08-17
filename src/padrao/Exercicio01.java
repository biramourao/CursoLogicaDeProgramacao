package padrao;
import java.util.Scanner;

public class Exercicio01 {
	/*
	 * Escreva um programa para ler 2 valores
	 * (considere que não serão
	 * informados valores iguais) e escrever o maior deles.
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Leia o primeiro numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Leia o segundo numero: ");
		n2 = leia.nextDouble();
		
		
		if (n1>n2) {
			System.out.println("O numero: " + n1 + " é maior!");
		}else if(n2>n1) {
			System.out.println("O numero: " + n2 + " é maior!");
		}

	}

}
