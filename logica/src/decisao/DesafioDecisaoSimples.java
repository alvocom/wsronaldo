package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual sua idade?"));
		
		if (idade >= 18 && idade <=70) {
			
			System.out.println(nome + ", seu voto � obrigat�rio");
			
		}
		else if((idade >= 16 && idade < 18) || idade >=70)
		{
			
			System.out.println(nome + ", seu voto � facultativo");
		}
		else
		{
			System.out.println(nome + ", voc� n�o pode votar");
		}
		
				
		
		
		
	}

}
