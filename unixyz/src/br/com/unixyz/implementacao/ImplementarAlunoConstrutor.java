package br.com.unixyz.implementacao;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAlunoConstrutor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toUpperCase(),
				JOptionPane.showInputDialog("Fone"),
				JOptionPane.showInputDialog("CPF"),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro").toUpperCase(),
						JOptionPane.showInputDialog("Bairro").toUpperCase(),
						JOptionPane.showInputDialog("Cidade").toUpperCase(),
						JOptionPane.showInputDialog("Estado").toUpperCase(),
						JOptionPane.showInputDialog("CEP").toUpperCase(),
						JOptionPane.showInputDialog("Número").toUpperCase(),
						JOptionPane.showInputDialog("Complemento").toUpperCase()
						)
							
				);
		
		//System.out.println(aluno.toString());
		System.out.println(aluno.getEndereco().getLogradouro());
	}

}
