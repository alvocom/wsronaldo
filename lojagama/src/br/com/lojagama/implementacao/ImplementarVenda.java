package br.com.lojagama.implementacao;

import javax.swing.JOptionPane;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.Pagamento;
import br.com.lojagama.modelo.Produto;
import br.com.lojagama.modelo.Venda;
import br.com.lojagama.util.Magic;

public class ImplementarVenda {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static void main(String[] args) {
		Venda venda = new Venda(
				Magic.i("NF"),
				Magic.s("Data"),
				new Cliente(
						"Casas bahia",
						"cb@email.com",
						"1234-4567",
						new Endereco(
								"logradouro",
								"Bairro",
								"Cidade",
								"Estado",
								"CEP",
								"1234",
								"Complemento"
								
								)
						),
				new Produto(
						1,
						"Desc",
						154.24,
						1254.24,
						10
						
						),
				new Pagamento(
						14.25,
						"Cartão",
						"12/05/2021"
						),
				12359.23
				);
		
		System.out.println(venda.getResumo());
		System.out.println("Sobre o Estoque: " + venda.getProduto().verificarEstoque());						
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra: " + venda.getProduto().getValorCompra());
		venda.getProduto().atualizarValores(10);
		System.out.println("Após atualização");
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra: " + venda.getProduto().getValorCompra());
		System.out.println("Total Venda: " + venda.getProduto().totalVenda());
		
	}
	

}
