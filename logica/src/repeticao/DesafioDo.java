package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * O Jogador1 ir� digitar um n�mero.
		 * Caber� ao Jogador 2 descobrir qual foi o n�mero digitado pelo Jogador1.
		 * Primeira Miss�o:
		 * - fazer com que a aplica��o pergunte o n�mero para o Jogador 2 enquanto
		 * ele n�o acertar o n�mero, e quando acertar exibir a mensagem de Parabens
		 * 
		 * Segunda Missao:
		 * - ap�s o Jogador2 chutar o n�mero voc� deve exibir para ele uma
		 * dica, informando se o n�mero digitado pelo Jogador1 � maior ou menor
		 * que o n�mero que ele digitou.
		 * 
		 * Terceira Missao:
		 * - Quando o Jogador2 acertar, junto a mensagem de parab�ns dever� exibir
		 * quantas tentativas ele utilizou at� acertar o n�mero (dica: ter�
		 * que utilizar uma vari�vel para contar)
		 */
		int cont = 1;
		int numero1 = 5; //Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		
		do {	
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o n�mero"));

			if (numero2 != numero1) {
				if (numero2 > numero1)
				{
					System.out.println("Seu numero est� maior");
					cont++;
					//cont+=1;
				}
				else if (numero2 < numero1) {
					System.out.println("Seu numero est� menor");
					cont++;
				}
			}
			else {
				System.out.println("Parab�ns, voc� acertou na " + cont + "� tentativa");
				cont = 1;
			}

			
		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar o jogo?","T�tulo",JOptionPane.YES_NO_OPTION)==0);

	}

}
