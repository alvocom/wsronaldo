package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/* Tipos primitivos:
		 * boolean = tipo l�gico (tru/false)
		 * char = 1 caracter (ap�stofros)  'a' (char) // "a" (String)
		 * byte = -128/+127
		 * short = -32 mil / +32 mil
		 * int = - 9 trilh�es / + 9 trilh�es
		 * long = quintilh�es
		 * float = decimal
		 * double = possui o dobro de precis�o em rela��o ao float
		 */
	}
	 float salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio:"));
	 float fgts = salario * (float) 0.08; // ocorre o casting
	 int numero = 5;
	 byte resultado = (byte) (numero + 2); // ocorre o casting
	 /*
	  *Classes Wrappers (Classes para apoiarem os tipos primitivos
	  *int = Int
	  *double = Double
	  *float = Float
	  *Plataformas Java
	  *ME
	  *SE
	  *EE
	  *
	  *DISTRIBUI��O
	  *JRE : PARA USU�RIOS (JVM)
	  *JDK: PARA PROGRAMADORES (JRE)
	  */
}
