package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * O Jogador1 irá digitar um número.
		 * Caberá ao Jogador 2 descobrir qual foi o número digitado pelo Jogador1.
		 * Primeira Missão:
		 * - fazer com que a aplicação pergunte o número para o Jogador 2 enquanto
		 * ele não acertar o número, e quando acertar exibir a mensagem de Parabens
		 * 
		 * Segunda Missao:
		 * - após o Jogador2 chutar o número você deve exibir para ele uma
		 * dica, informando se o número digitado pelo Jogador1 é maior ou menor
		 * que o número que ele digitou.
		 * 
		 * Terceira Missao:
		 * - Quando o Jogador2 acertar, junto a mensagem de parabéns deverá exibir
		 * quantas tentativas ele utilizou até acertar o número (dica: terá
		 * que utilizar uma variável para contar)
		 */
		int cont = 1;
		int numero1 = 5; //Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		
		do {	
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o número"));

			if (numero2 != numero1) {
				if (numero2 > numero1)
				{
					System.out.println("Seu numero está maior");
					cont++;
					//cont+=1;
				}
				else if (numero2 < numero1) {
					System.out.println("Seu numero está menor");
					cont++;
				}
			}
			else {
				System.out.println("Parabéns, você acertou na " + cont + "ª tentativa");
				cont = 1;
			}

			
		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar o jogo?","Título",JOptionPane.YES_NO_OPTION)==0);

	}

}
