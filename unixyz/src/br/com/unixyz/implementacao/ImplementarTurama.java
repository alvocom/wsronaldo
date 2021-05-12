package br.com.unixyz.implementacao;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Turma;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Professor;

public class ImplementarTurama {

	public static void main(String[] args) {
		Turma turma = new Turma(
				1,
				"Turma18c",
				"Diurno",
				new Aluno(
						1213,
						"nome aluno",
						"email aluno",
						"1234-5678",
						"1234567899",
						new Endereco(
								"log",
								"bairro",
								"cidade",
								"estado",
								"123-000",
								"132",
								"complemento"
								)
						),
				new Professor(
						new Endereco(
								"log",
								"bairro",
								"cidade",
								"estado",
								"123-000",
								"132",
								"complemento"
								),
						"prof",
						"tit",
						50
						),
				new Curso(
						"descrição",
						"sigla",
						5000,
						"formação"
						)
				
				);
		
		System.out.println("Professor:" + turma.getProfessor().getNome());
		System.out.println("Aluno" + turma.getAluno().getNome());
		System.out.println("Cidade" + turma.getAluno().getEndereco().getCidade());
		System.out.println("Curso:" + turma.getCurso().getDescricao());
		System.out.println("Turma:" + turma.getNome());

	}

}
