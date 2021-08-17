package sistemaBanco;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.numero = 123;
		conta1.titular = "Pablo";
		conta1.saldo = 5000.00;
		
		System.out.println(conta1.numero);
		System.out.println(conta1.titular);
		System.out.println(conta1.saldo);

	}

}
