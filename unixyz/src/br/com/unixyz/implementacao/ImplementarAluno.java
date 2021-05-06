package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setBasico("REGINA", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("regina@itaquera.com.br");
		aluno.setFone("1234-1234");
		
		System.out.println(aluno.toString());
		
	}

}
