package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente. 
		
        */
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3"));
		String resultado = "";
		
		if ((valor1 != valor2) && (valor2 != valor3) && (valor3 != valor1)) {
			/*if (valor1 > valor2 && valor1 > valor3 ) {
				resultado = valor1 + ";" + valor2 + ";" + valor3;
			}
			else if (valor3 > valor2 && valor3 > valor1) {
				resultado = valor3 + ";" + valor2 + ";" + valor1;
			}
			else if (valor2 > valor1 && valor2 > valor3) {
				resultado = valor2 + ";" + valor1 + ";" + valor3;
			}
			else if (valor2 > valor3 && valor2 > valor1) {
				resultado = valor2 + ";" + valor3 + ";" + valor1;
			}
			else if (valor3 > valor1 && valor3 > valor2) {
				resultado = valor3 + ";" + valor1 + ";" + valor2;
			}*/
			if(valor1>valor2 && valor1>valor3) {
				System.out.println(valor1);
				if (valor2>valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
			}else if(valor2>valor1 && valor2>valor3) {
				System.out.println(valor2);
				if (valor1>valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);
				}
			}else {
				System.out.println(valor3);
				if (valor1>valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
			
		}
		
			
		
		
	}

}
