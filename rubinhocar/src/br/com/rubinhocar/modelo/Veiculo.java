package br.com.rubinhocar.modelo;

public class Veiculo {

	//private nenhuma outra classe terá acesso à variável

	private float valor;
	private String modelo;
	private String montadora;
	
	
	// criacao de metodo: <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome param>)
	public String retornarModelo() {
		return modelo;
	}

	public void preencherModelo(String param) {
		if (modelo.length() <=40) {
			modelo = param.toUpperCase();
		}

	}

	public void preencherValor(float param) {
		valor = param;

	}

	public float retornarValor() {
		return valor;
	}

	public void preencherMontadora(String param) {
		if (montadora.length() <=30) {
			montadora = param.toUpperCase();
		}
	}

	public String retornarMontadora() {
		return montadora;
	}

	public void preencherTudo(float pValor,String pModelo,String pMontadora) {
		valor = pValor;
		if (modelo.length()<=40) {
			modelo = pModelo;
		}
		if (montadora.length()<=30) {
			montadora = pMontadora;
		}
	}

	public String retornarTudo() {
		return "Modelo: " + modelo + "\n" +
				"Montadora: " + montadora + "\n" +
				"Valor: " + valor + "\n";
	}

	public float retornarDesconto() {
		return valor * (float) 0.9;
	}

}
