package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Digite o produto");
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor de Compra"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		
		double valorVenda = valorCompra * 1.2;
		double totalVenda = valorVenda * qtde;
		double imposto = totalVenda * 0.22;
				
		System.out.println("Nome do produto:" + produto);
		System.out.println("Valor de venda:" + valorVenda);
		System.out.println("Quantidade:" + qtde);
		System.out.println("Total (-impostos):" + (totalVenda-imposto));
		
	}
}
