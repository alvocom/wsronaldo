package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Capturar: dia, mes e ano em variaveis diferentes
		 * Valide o dia para que ele esteja entre 1 e 30 ou 1 e 31 ou 1 e 29
		 * Valide o mes para que esteja entre 1 e 12
		 * Valide o ano para que seja menor 2003 e maior que 1952
		 * 
		 * No final exibam a data completa
		 */
		
		/*String data = JOptionPane.showInputDialog("Digite a data");
		short ano = Short.parseShort(data.substring(0,4));
		byte mes = Byte.parseByte(data.substring(5,2));
		byte dia = Byte.parseByte(data.substring(7,2));*/
		
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		
			
		while (ano < 1952 || ano >= 2003)
		{
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		}
		
		while (mes < 1 || mes > 12)
		{
			mes = Byte.parseByte(JOptionPane.showInputDialog("Ano"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente"));
			}
		}
		else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while(dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente"));
			}
		}
		else {
			while(dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente"));
			}
		}
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);

	}

}
