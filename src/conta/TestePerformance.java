package conta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> testa = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
		testa.add(i);
		}

		for (int i = 0; i < total; i++) {
		testa.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
