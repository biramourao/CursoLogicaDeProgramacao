package padrao;
import java.util.Scanner;

public class Exercicio04 {
/*
 * As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, 
 * e R$ 0,25 se
forem compradas pelo menos doze. Escreva um programa que leia o n�mero de ma��s
compradas, calcule e escreva o valor total da compra.
 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double precoMacaMenosDeDoze = 0.30;
		double precoMacaDozeOuMais = 0.25;
		int qtdMacaCompradas;
		double valorTotalCompra;
		
		System.out.println("Digite a quantidade de ma��s que voce ir� comprar: ");
		qtdMacaCompradas = leia.nextInt();
		
		if(qtdMacaCompradas>=12) {
			System.out.println("O pre�o final aplicado a cada ma�� foi: " + precoMacaDozeOuMais);
			valorTotalCompra = qtdMacaCompradas*precoMacaDozeOuMais;
		}else {
			System.out.println("O pre�o final aplicado a cada ma�� foi: " + precoMacaMenosDeDoze);
			valorTotalCompra = qtdMacaCompradas*precoMacaMenosDeDoze;
		}
		
		System.out.println("O valor total da compra foi: " + valorTotalCompra);
		
		
	}

}
