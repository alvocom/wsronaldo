package br.com.caicai.teste;

import javax.swing.JOptionPane;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador objeto = new Elevador();

		objeto.iniciar("Torre B",20,0,8);
		System.out.println(objeto.retornarTudo());		
		System.out.println(objeto.subir());
		objeto.entrar();
		objeto.entrar();
		objeto.entrar(20);
		System.out.println(objeto.descer());
	
	            
	           
	
	}

}
