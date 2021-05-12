package br.com.unixyz.modelo;
/*
 * Design Pattern: compilado de padrões de projetos para OO
 * Um doa padrões é o DTO (Data TRansefer Object) cuja função é aplicar boa prática na transição entre projeto e a programação
 * 
 * Sugestoes:
 * 1 - TODOS os atributos da classe devem estar como privados
 * 2 - Cada atributo deve possuir um metodo set e outro get
 * 
 */


public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;
    
	public Aluno() {};
	
	public Aluno(int rm, String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf
				+ ", endereco=" + endereco + "]";
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setBasico(String nome,int rm) {
		this.nome = nome;
		this.rm = rm;
	}

	public String getResumo() {
		return 
				"RM: " + rm + "\n" +
				"Nome: " + nome;
	}
	public String getUsuario() {
		if (email.equals("@")) {
			return  email.substring(0,email.indexOf("@"));
		}
		return email;
	}





}
