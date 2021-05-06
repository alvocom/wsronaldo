package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;


	public void iniciar(String pNome,int pAndarMax,int pAndarMin,int capPessoas) {
		nome=pNome;
		andarMaximo=pAndarMax;
		andarMinimo=pAndarMin;
		capacidadePessoas=capPessoas;

	}

	public String retornarTudo() {
		return 
				"Nome.........: " + nome + "\n" +
				"Andar Máximo.: " + andarMaximo + "\n" + 
				"Andar Minimo.: " + andarMinimo + "\n" + 
				"Capacidade...: " + capacidadePessoas + "\n" + 
				"Andar Atual..: " + andarAtual + "\n" + 
				"Qtde Pessoas.: " + qtdePessoas;
	}

	public String subir() {

		if (andarAtual >= andarMaximo) {
			return "Não pode subir. Elevador já se encontra no último andar";
		}
		return "Subindo para o andar: " + andarAtual++;
	}

	public String descer() {
		if (andarAtual <= andarMinimo) {
			return "Não pode descer. Elevador já se encontra no andar mínimo";
		}
		return "Descendo para o andar: " + andarAtual--;
	}

	public void entrar() {
		if (qtdePessoas < capacidadePessoas) {
			qtdePessoas++;
		}

	}

	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas--;
		}
	}

	public void entrar(int pQtde) {
		int resultado = pQtde + qtdePessoas;
		if (resultado <= capacidadePessoas ) {
			qtdePessoas+=pQtde;
		}
	}

}
