package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		
		double total=0;
		double media=0;
		int totDba=0;
		int totNivelJr=0;
		double maiorSalario = 0;
		Cargo resposta = new Cargo();
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "JR", 15000));

		System.out.println("Completa: " + lista);
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nível: " + objeto.getNivel());
			System.out.println("Salário: " + objeto.getSalario());
			System.out.println("=====================================");
			total+=objeto.getSalario();
			if (objeto.getNome().equals("DBA")) {
				totDba+=objeto.getSalario();
			}
			
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				totNivelJr++;
			}
			if (objeto.getSalario() > resposta.getSalario() ) {
				resposta=objeto;
			}
			
		}
		
		/*
		 * Requisicao
		 * - exibir o total de salario
		 * - media dos salarios
		 * - o total dos DBA'S
		 * - a quantidade de cargo nivel junior
		 * o nome do cargo e o nivel que possui o maior salario
		 * 
		 */
		media = total / lista.size();
		System.out.println("Total de Salário: " + total);
		System.out.println("Média de Salário: " + media);
		System.out.println("Total de DBA's: " + totDba);
		System.out.println("Qtde de JR's: " + totNivelJr);
		System.out.println("Maior Salário: " + resposta);
	}

}
