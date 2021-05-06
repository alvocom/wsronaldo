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
				"Andar M�ximo.: " + andarMaximo + "\n" + 
				"Andar Minimo.: " + andarMinimo + "\n" + 
				"Capacidade...: " + capacidadePessoas + "\n" + 
				"Andar Atual..: " + andarAtual + "\n" + 
				"Qtde Pessoas.: " + qtdePessoas;
	}

	public String subir() {

		if (andarAtual >= andarMaximo) {
			return "N�o pode subir. Elevador j� se encontra no �ltimo andar";
		}
		return "Subindo para o andar: " + andarAtual++;
	}

	public String descer() {
		if (andarAtual <= andarMinimo) {
			return "N�o pode descer. Elevador j� se encontra no andar m�nimo";
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
