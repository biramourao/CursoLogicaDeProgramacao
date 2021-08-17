package padrao;
import java.util.ArrayList;

public class Repeticoes {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Frango"); //0
		nomes.add("Pablo"); //1
		nomes.add("Bibi"); //2
		nomes.add("Bira"); //3
		nomes.add("Yasmin");
		nomes.add("Raiany");
		
		//nomes.size() = 6
		int i = 0;
		
		while(i<nomes.size()) {
						
			System.out.println("Nome Atual: " + nomes.get(i));
			
			
			if(nomes.get(i).contains("Bi")) {
				System.out.println("Achei o que procurava: " + nomes.get(i) + ", mas vou continuar procurando...");
				i++;
				continue;
			}
			
			i++;
		}
		
	}

}
