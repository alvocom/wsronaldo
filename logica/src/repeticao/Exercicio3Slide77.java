package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3Slide77 {

	public static void main(String[] args) {
		/*3�) Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade (M�dio, Superior ou P�s) 
		 * enquanto a resposta for v�lida, ir� computando os totais dos n�veis digitados, no final apresente somente o n�vel que foi mais votado.
		 */

		int contaMedio =0;
		int contaSuperior =0;
		int contaPos=0;
		int resultado = 0;
        String nivel="";
        String nome="";
        
		do {
			nivel = JOptionPane.showInputDialog("Qual seu n�vel de escolaridade").toUpperCase();
				if (nivel.equals("M�DIO")) {
					contaMedio++;
				} else if (nivel.equals("SUPERIOR")) {
					contaSuperior++;
				}else if (nivel.equals("P�S")) {
					contaPos++;
				}
				else {
					nivel = JOptionPane.showInputDialog("Informe seu n�vel de escolaridade corretamente").toUpperCase();
				}
			
		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar a pesquisa?","Escolaridade",JOptionPane.YES_NO_OPTION)==0);


		if (contaMedio > contaSuperior && contaMedio > contaPos) {
			resultado = contaMedio;
			nome = "M�DIO";
		}
		else if(contaSuperior >contaMedio  && contaSuperior > contaPos) {
			resultado = contaSuperior;
			nome = "SUPERIOR";
		}
		else if(contaPos >contaMedio  &&  contaPos > contaSuperior) {
			resultado = contaPos;
			nome = "P�S";
		}
		else {
			resultado=0;
			nome="Houve empate";
				
		}
			


		System.out.println("Resultado: " + nome);
		System.out.println("Quantidade:" + resultado);


	}

}
