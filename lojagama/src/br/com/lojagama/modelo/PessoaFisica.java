package br.com.lojagama.modelo;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	
	public String getDocumentos() {
		return cpf + ";" + rg;
	}
	
	public PessoaFisica(String nome, String email, String fone, Endereco endereco, String cpf, String rg) {
		super(nome, email, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
	}

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	

}
