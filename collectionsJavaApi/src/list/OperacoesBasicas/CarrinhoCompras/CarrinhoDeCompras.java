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
		List<Item> itensParaRemover = new ArrayList<>();

		for (Item itens : carrinho) {
			if (itens.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(itens);
			}
		}
		carrinho.removeAll(itensParaRemover);
	}

	
	public void calcularValorTotal() {
		//List<Item> totalCarrinho = new ArrayList<Item>();
		double valor = 0;
		for(Item itens: carrinho) {
			for(int i = 1; i<= itens.getQuantidade(); i++ ) {
				valor +=itens.getPreco();
			}
		}
		System.out.println("O preço total do carrinho é R$"+valor);
	}
	
	public void exibirItens() {
		System.out.println(carrinho);
	}
}
