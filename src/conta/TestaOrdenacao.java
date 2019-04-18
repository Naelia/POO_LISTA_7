package conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestaOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ContaPoupanca> conta = new ArrayList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		
			c1.setNumero(19);
			conta.add(c1);
			
		ContaPoupanca c2 = new ContaPoupanca();
			c2.setNumero(14);
			conta.add(c2);
			
		ContaPoupanca c3 = new ContaPoupanca();
			c3.setNumero(18);
			conta.add(c3);
			Collections.sort(conta);
			
		for (int i = 0; i < conta.size(); i++) {
			Conta atual = conta.get(i);
			System.out.println("numero: " + atual.getNumero());
		}
	}
			
}


