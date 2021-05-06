package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		while (email.contains("@") == false) {
			email = JOptionPane.showInputDialog("Digite o email com @").toLowerCase();
		}
		System.out.println("Usuário: " + email.substring(0,email.indexOf("@")));

		/*
		 * exibir o nome somente se o nome tiver mais que 3 caracteres e menos que 15 caracteres
		 */

		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();

		while (nome.length() < 3 || nome.length() > 15)
		{
			nome = JOptionPane.showInputDialog("Digite o nome com mais de 3 caracteres e no máximo 15 caracteres").toLowerCase();

		}

		System.out.println("Nome:" + nome);

	}

}
