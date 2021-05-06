package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3Slide77 {

	public static void main(String[] args) {
		/*3º) Crie um programa que pergunte ao usuário o seu nível de escolaridade (Médio, Superior ou Pós) 
		 * enquanto a resposta for válida, irá computando os totais dos níveis digitados, no final apresente somente o nível que foi mais votado.
		 */

		int contaMedio =0;
		int contaSuperior =0;
		int contaPos=0;
		int resultado = 0;
        String nivel="";
        String nome="";
        
		do {
			nivel = JOptionPane.showInputDialog("Qual seu nível de escolaridade").toUpperCase();
				if (nivel.equals("MÉDIO")) {
					contaMedio++;
				} else if (nivel.equals("SUPERIOR")) {
					contaSuperior++;
				}else if (nivel.equals("PÓS")) {
					contaPos++;
				}
				else {
					nivel = JOptionPane.showInputDialog("Informe seu nível de escolaridade corretamente").toUpperCase();
				}
			
		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar a pesquisa?","Escolaridade",JOptionPane.YES_NO_OPTION)==0);


		if (contaMedio > contaSuperior && contaMedio > contaPos) {
			resultado = contaMedio;
			nome = "MÉDIO";
		}
		else if(contaSuperior >contaMedio  && contaSuperior > contaPos) {
			resultado = contaSuperior;
			nome = "SUPERIOR";
		}
		else if(contaPos >contaMedio  &&  contaPos > contaSuperior) {
			resultado = contaPos;
			nome = "PÓS";
		}
		else {
			resultado=0;
			nome="Houve empate";
				
		}
			


		System.out.println("Resultado: " + nome);
		System.out.println("Quantidade:" + resultado);


	}

}
