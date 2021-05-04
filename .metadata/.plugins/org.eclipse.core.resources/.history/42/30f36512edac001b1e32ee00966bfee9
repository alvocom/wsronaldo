package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		short falta = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de faltas"));
		String disciplina = JOptionPane.showInputDialog("Disciplina").toLowerCase();
		
		
		if (falta < 20) {
			
			float primeiraNota = Float.parseFloat(JOptionPane.showInputDialog("Primeira nota"));
			float segundaNota = Float.parseFloat(JOptionPane.showInputDialog("Segunda nota"));
			float media = (primeiraNota + segundaNota)/2;
					
			if(media >= 6) {
				System.out.println("Você foi aprovado na disciplina: " + disciplina + ". Parabens!");
			}
			else if (media > 4 && media <= 5.9) {
				System.out.println("Você está de exame na disciplina: " + disciplina);
				
			}
			else 	{
				System.out.println("Você foi reprovado");
			}
			
			System.out.println("Sua média foi:" + media);
		} else 	{
			System.out.println("Você foi reprovado por falta. Ultrapassou 19 faltas");
		}
		
		
		
	}
}
