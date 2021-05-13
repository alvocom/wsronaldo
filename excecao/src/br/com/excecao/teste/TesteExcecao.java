package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exceções Unchecked (DC) - Depois da compilação
		// Exceções Checked (AC) - Antes da compilação
		
		
		
		try {
			
			/*int numero = Integer.parseInt("7");
			System.out.println("Número: " + numero);
			
			String palavra="";
			System.out.println("Qtde de letras: " + palavra.length());
			/*
			 * Particularidades dos vetores:
			 * Seu tamanho é estático
			 * Os dados são homogêneos (String ou Int....)
			 * Exige uma variável (índice) para controlar as posições
			 * Não é possível remover uma posição
			 * Ordenação dá trabalho para fazer
			 */
					
			String palavras[] = new String[10];
			
			int indice=0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog(null, "Continuar","Vetores",JOptionPane.YES_NO_OPTION)==0);
			
			
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra nº " + contador + " = " + palavras[contador]);
			}
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Volte sempre");
			//encerrar Banco de dados
		}
		

	}

}
