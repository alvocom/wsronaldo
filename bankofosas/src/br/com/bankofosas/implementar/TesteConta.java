package br.com.bankofosas.implementar;

import br.com.bankofosas.modelo.Agencia;
import br.com.bankofosas.modelo.Cliente;
import br.com.bankofosas.modelo.Conta;
import br.com.bankofosas.modelo.Corrente;
import br.com.bankofosas.modelo.Endereco;
import br.com.bankofosas.modelo.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(
				"Ronaldo",
				"ronaldo@email.com",
				"1234-1234",
				endereco,
				1
				);
		Agencia agencia = new Agencia(
				"Ronaldo",
				123,
				"1234-1234"
				);
		
		Conta conta = new Conta();
		
		char resposta = Magic.s("Digite C para conta corrente ou P para poupança").charAt(0);
		int numero = Magic.i("Numero");
		double saldo = Magic.d("Saldo");
		if (resposta =='C') {
			conta = new Corrente(
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Limite"),
					Magic.d("Taxa")
					);
		}
		else if (resposta =='P') {
			conta = new Poupanca(
					
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Rendimento"),
					Magic.s("Aniversário")
					);
		}
		else {
			System.out.println("Opção inválida");
		}
		conta.depositar(1000);
		System.out.println("Depositou: " + conta.getSaldo());
		conta.sacar(500);
		System.out.println("Sacou: " + conta.getSaldo());
		conta.sacar(10000);
		System.out.println("Sacou muito: " + conta.getSaldo());
		
		if (conta instanceof Poupanca) {
			((Poupanca) conta).creditarRendimentos();
			System.out.println("Dia: " + ((Poupanca) conta).getDiaAniversario());
			System.out.println("Taxa: ");
		}

	}

}
