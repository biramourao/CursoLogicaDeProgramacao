package padrao;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Escreva um programa para ler o ano de nascimento de uma pessoa 
	 * e escrever uma mensagem que diga se ela poder� ou n�o votar 
	 * este ano (n�o � necess�rio considerar o m�s em que ela nasceu).
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int anoNascimento;
		int anoAtual = 2021;
		//int anoAtual2 = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if(idade<16) {
			System.out.println("Voce n�o pode votar");
		}else if(idade>16 && idade<18) {
			System.out.println("Voce est� autorizado a votar, mas n�o � obrigado!!");
		}else if(idade>60){
			System.out.println("Voce est� autorizado a votar, mas n�o � obrigado, v� descan�ar idoso(a)!!");
		}else {
			System.out.println("Voce � obrigado a votar!!!!");
		}

	}

}
