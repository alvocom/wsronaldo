package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("N?mero 1:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("N?mero 2:"));
		String sinal =JOptionPane.showInputDialog("Digite o sinal de opera??o:");
		
		int resultado = 0;
		
		if (sinal == "+") {
			resultado = numero1 + numero2;
		}
		else if (sinal.equals("-")) {
			resultado = numero1 - numero2;
		}
		else if (sinal.equals("/")) {
			resultado = numero1 / numero2;
		}
		else if (sinal.equals("*")) {
			resultado = numero1 * numero2;
		}
		else {
			System.out.println("Determine um operador v?lido");
			return;
		}
			
		System.out.println("Resultado ->" + resultado);
		
	}

}
