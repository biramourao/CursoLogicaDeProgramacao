package padrao;
import java.util.Scanner;

public class Exercicio05 {
/*
 * Escreva um programa para ler 3 valores inteiros 
 * (considere que não serão lidos valores
	iguais) e escrevê-los em ordem crescente.
 */
	public static void main(String[] args) {
		int v1, v2, v3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		v1 = leia.nextInt();
		v2 = leia.nextInt();
		v3 = leia.nextInt();

		if(v1<v2 && v1<v3) {
			if(v2<v3) {
				System.out.println(v1 + " " + v2 + " " + v3);
			}else {
				System.out.println(v1 + " " + v3 + " " + v2);
			}
		}else if(v2<v1 && v2<v3){
			if(v1<v3) {
				System.out.println(v2 + " " + v1 + " " + v3);
			}else {
				System.out.println(v2 + " " + v3 + " " + v1);
			}
			
		}else if(v3<v2 && v3<v1) {
			if(v2<v1) {
				System.out.println(v3 + " " + v2 + " " + v1);
			}else {
				System.out.println(v3 + " " + v1 + " " + v2);
			}
		}else {
			System.out.println("Os numeros são iguais");
		}
	}

}
