package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1. Um hotel cobra R$ 80,00 a di?ria e mais uma taxa de servi?os. 
			A taxa de servi?os ? de: 
			?	R$ 5,50 por di?ria, se o n?mero de di?rias for maior que 15; 
			?	R$ 6,00 por di?ria, se o n?mero de di?rias for igual a 15; 
			?	R$ 8,00 por di?ria, se o n?mero de di?rias for menor que 15.
			Monte uma aplica??o que apresente a conta do cliente.

		 */
		
		String cliente = JOptionPane.showInputDialog("Informe seu nome:").toUpperCase();
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de dias"));
		float valor = 80;
		float total = 0;
		if (diaria > 15) {
			total = (float) ((diaria * valor) + 5.50);
			
		}
		else if (diaria == 15) {
			total = (float) ((diaria * valor) + 6.00);
		}
		else {
			total = (float) ((diaria * valor) + 8.00);
		}
	 
		
		System.out.println(cliente + ", sua conta ficou no valor de: R$" + total);
		
	}

}
