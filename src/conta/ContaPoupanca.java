package conta;

public class ContaPoupanca extends Conta  implements Comparable<ContaPoupanca> {

	@Override
	public int compareTo(ContaPoupanca cp) {
		if (this.getNumero() < cp.getNumero()) {
			return -1;
		}else if (this.getNumero() > cp.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	

}
