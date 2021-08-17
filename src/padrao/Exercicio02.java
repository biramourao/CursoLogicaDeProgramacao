package padrao;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Escreva um programa para ler o ano de nascimento de uma pessoa 
	 * e escrever uma mensagem que diga se ela poderá ou não votar 
	 * este ano (não é necessário considerar o mês em que ela nasceu).
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
			System.out.println("Voce não pode votar");
		}else if(idade>16 && idade<18) {
			System.out.println("Voce está autorizado a votar, mas não é obrigado!!");
		}else if(idade>60){
			System.out.println("Voce está autorizado a votar, mas não é obrigado, vá descançar idoso(a)!!");
		}else {
			System.out.println("Voce é obrigado a votar!!!!");
		}

	}

}
