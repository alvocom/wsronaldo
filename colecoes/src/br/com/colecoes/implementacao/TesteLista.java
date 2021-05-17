package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {
/*
 * Caracter�sticas da Collection List
 * - tamanho � din�mico
 * - nao h� necessidade de qualquer recurso para controlar o �ndice
 * - os dados podem ser heterog�neos
 * - podemos eliminar posicoes em execu��o
 * 
 */
	public static void main(String[] args) {
		/*<> Chama-se lista Generics
		 * List<String> recomendacao do eclipse nao pelo Java
		 * Em generics sempre chama uma classe (Double, Integer...)
		 */
		List<String> lista = new ArrayList<String>(); 
		do {
			lista.add((JOptionPane.showInputDialog("Digite o cargo")));


		}while(JOptionPane.showConfirmDialog(null, "?","",JOptionPane.YES_OPTION)==0);
		System.out.println(lista);
		//lista.add(7);
		//lista.add(true);
		//lista.add('a');
		System.out.println("Primeiro:" + lista.get(0)); // exibindo o primeiro da lista;
		lista.remove(0); // removendo o primeiro item;
		System.out.println("Depois de remover: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		
		for(int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
	}

}
