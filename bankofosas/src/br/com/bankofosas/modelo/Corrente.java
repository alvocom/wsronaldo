package br.com.bankofosas.modelo;

public class Corrente extends Conta{
	private double limite;
	private double taxa;

	public double getSaldo() {

		return super.getSaldo()+limite;

	}

	public void sacar(double valor){
		
		if (getSaldo()>=valor) {
			super.setSaldo(super.getSaldo()-valor);
		}
	}
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo()-taxa);
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}



}
