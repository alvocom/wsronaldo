package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Disciplina").toLowerCase();
		float primeiraNota = Float.parseFloat(JOptionPane.showInputDialog("Primeira nota"));
		float segundaNota = Float.parseFloat(JOptionPane.showInputDialog("Segunda nota"));
		float media = (primeiraNota + segundaNota)/2;
		
		if(media >= 6) {
			System.out.println("Voc� foi aprovado na disciplina: " + disciplina + ". Parabens!");
		}
		else if (media > 4 && media <= 5.9)
		{
			System.out.println("Voc� est� de exame na disciplina: " + disciplina);
			
		}
		else
		{
			System.out.println("Voc� foi reprovado");
		}
		
		System.out.println("Sua m�dia foi:" + media);
		
		
	}
}
