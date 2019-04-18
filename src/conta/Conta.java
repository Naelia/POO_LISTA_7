package conta;

public abstract class Conta {
	
	private String titular;
	private String cpf;
	private double saldo;
	private double agencia;
	protected int numero;

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double deposito) {
		this.saldo = deposito;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
