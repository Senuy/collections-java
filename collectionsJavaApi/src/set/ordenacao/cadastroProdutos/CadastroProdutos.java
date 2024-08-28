package set.ordenacao.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		produtoSet = new HashSet<>();
	}

	private void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}

	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(646, "coca", 10.50, 1000);
		cadastroProdutos.adicionarProduto(646, "coca1", 10.50, 2000);
		cadastroProdutos.adicionarProduto(646684, "coca2", 10.50, 3000);
		cadastroProdutos.adicionarProduto(6468846, "coca3", 10.50, 4000);
		cadastroProdutos.adicionarProduto(6484656, "coca4", 10.50, 5000);
		cadastroProdutos.adicionarProduto(6456646, "coca5", 10.50, 6000);
		
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println(cadastroProdutos.exibirPorPreco());
		

	}

}
