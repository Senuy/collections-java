package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> carrinho;

	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<Item>();

		for (Item item : itensParaRemover) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}

			carrinho.removeAll(itensParaRemover);

		}
	}

	
	public void calcularValorTotal() {
		List<Item> totalCarrinho = new ArrayList<Item>();
		double Valor = 0;
		for(Item item: totalCarrinho) {
			Valor +=item.getPreco();
		}
		System.out.println("O preço total do carrinho é R$"+Valor %.2f);
	}
	
	public void exibirItens() {
		System.out.println(carrinho);
	}
}
