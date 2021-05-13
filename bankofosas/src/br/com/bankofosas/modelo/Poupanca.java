package br.com.bankofosas.modelo;

public class Poupanca extends Conta{
	private double rendimento;
	private String aniversario;
	
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo()+rendimento);
	}
	
	public String getDiaAniversario() {
		if (aniversario.length()>2) {
		return aniversario;
		}
		return "Aniversario inválido";
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia, double rendimento, String aniversario) {
		super(numero, saldo, cliente, agencia);
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}
	public Poupanca() {
		super();
	}
	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", aniversario=" + aniversario + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
