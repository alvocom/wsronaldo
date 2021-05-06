package repeticao;

import javax.swing.JOptionPane;

public class Exercicio4Slide77 {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. A aplicação continuará perguntando nome e idade enquanto o usuário afirmar que deseja continuar.
			Ao terminar, a aplicação deverá exibir:
			- a quantidade de pessoas maiores de idade e 
			- a média entre todas as idades que foram digitadas. 
			- a pessoa mais experiente (nome e idade)
			- a pessoa mais jovem (nome e idade)
		 */


		int contaMaior =0;
		int media=0;
		int cont = 0;
		int expIdade=0;
		int jovIdade=0;
		int totIdade=0;
		String expNome="";
		String jovNome="";
		String nome="";
		short idade=0;

		do {
			nome = JOptionPane.showInputDialog("Qual seu nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Qual sua idade"));
			totIdade+=idade;
			if (idade >= 18) {
				contaMaior++;
			}
			if (idade < jovIdade || cont==0) {
				jovNome = nome;
				jovIdade = idade;
			}

			if (idade > expIdade) {
				expNome = nome;
				expIdade = idade;
			}
			cont++;

		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar a pesquisa?","Escolaridade",JOptionPane.YES_NO_OPTION)==0);

		media = (totIdade) / cont;

		System.out.println("Maiores de idade: " + contaMaior);
		System.out.println("Média: " + media);
		System.out.println("Nome mais experiente: " + expNome);
		System.out.println("Idade mais experiente: " + expIdade);
		System.out.println("Nome mais jovem: " + jovNome);
		System.out.println("Idade mais jovem: " + jovIdade);
	}

}
