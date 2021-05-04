package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	
public static void main(String[] args) {
	String nome = JOptionPane.showInputDialog("Digite seu nome");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
	double imc = peso / (altura * altura);
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Altura: " + altura);
	System.out.println("IMC: " + imc);
	
}

}
