package padrao;
import java.util.Scanner;

public class Exercicio03 {
/*
 * Escreva um programa que verifique a validade de uma senha fornecida 
 * pelo usuário. 
 * A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
 * ◦ ACESSO PERMITIDO caso a senha seja válida.
 * ◦ ACESSO NEGADO caso a senha seja inválida.
 */
	public static void main(String[] args) throws Exception {
		Scanner leia = new Scanner(System.in);
		
		int senhaValida = 1234;
		int senhaDigitada;
		
		
		
		System.out.println("Digite a senha de acesso: ");
		senhaDigitada = leia.nextInt();
		
		
		if(senhaDigitada==senhaValida) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.out.println("ACESSO NEGADO");
		}
		
	}

}
