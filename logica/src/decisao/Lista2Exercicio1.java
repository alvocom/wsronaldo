package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1. Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
			A taxa de serviços é de: 
			•	R$ 5,50 por diária, se o número de diárias for maior que 15; 
			•	R$ 6,00 por diária, se o número de diárias for igual a 15; 
			•	R$ 8,00 por diária, se o número de diárias for menor que 15.
			Monte uma aplicação que apresente a conta do cliente.

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
