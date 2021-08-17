package padrao;
import java.util.Scanner;

public class Exercicio04 {
/*
 * As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
 * e R$ 0,25 se
forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs
compradas, calcule e escreva o valor total da compra.
 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double precoMacaMenosDeDoze = 0.30;
		double precoMacaDozeOuMais = 0.25;
		int qtdMacaCompradas;
		double valorTotalCompra;
		
		System.out.println("Digite a quantidade de maçãs que voce irá comprar: ");
		qtdMacaCompradas = leia.nextInt();
		
		if(qtdMacaCompradas>=12) {
			System.out.println("O preço final aplicado a cada maçã foi: " + precoMacaDozeOuMais);
			valorTotalCompra = qtdMacaCompradas*precoMacaDozeOuMais;
		}else {
			System.out.println("O preço final aplicado a cada maçã foi: " + precoMacaMenosDeDoze);
			valorTotalCompra = qtdMacaCompradas*precoMacaMenosDeDoze;
		}
		
		System.out.println("O valor total da compra foi: " + valorTotalCompra);
		
		
	}

}
