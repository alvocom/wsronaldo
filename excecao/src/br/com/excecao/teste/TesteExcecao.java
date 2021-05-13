package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es Unchecked (DC) - Depois da compila��o
		// Exce��es Checked (AC) - Antes da compila��o
		
		
		
		try {
			
			/*int numero = Integer.parseInt("7");
			System.out.println("N�mero: " + numero);
			
			String palavra="";
			System.out.println("Qtde de letras: " + palavra.length());
			/*
			 * Particularidades dos vetores:
			 * Seu tamanho � est�tico
			 * Os dados s�o homog�neos (String ou Int....)
			 * Exige uma vari�vel (�ndice) para controlar as posi��es
			 * N�o � poss�vel remover uma posi��o
			 * Ordena��o d� trabalho para fazer
			 */
					
			String palavras[] = new String[10];
			
			int indice=0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog(null, "Continuar","Vetores",JOptionPane.YES_NO_OPTION)==0);
			
			
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra n� " + contador + " = " + palavras[contador]);
			}
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Volte sempre");
			//encerrar Banco de dados
		}
		

	}

}
