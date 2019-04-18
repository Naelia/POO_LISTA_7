package conta;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new ContaCorrente();
		conta1.deposito(300);
		
		Conta conta2 = new ContaCorrente();
		conta2.deposito(30);
		
		Map mapaDeContas = new HashMap();
		
		
		mapaDeContas.put("diretor", conta1);
		mapaDeContas.put("gerente", conta2);
		
		
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		Conta gerente = (Conta) mapaDeContas.get("gerente");
		System.out.println(gerente.getSaldo());
	}

}
