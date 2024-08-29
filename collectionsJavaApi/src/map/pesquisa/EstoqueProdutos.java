package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map <Long, Produtos> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotal=0;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produtos p : estoqueProdutosMap.values()) {
				valorTotal += p.getQuantidade() *p.getPreco();
			}
		}
		return valorTotal;
	}
	
	public  Produtos obterProdutoMaisCaro() {
		Produtos produtoMaisCaro= null;
		double valor= Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produtos p: estoqueProdutosMap.values()) {
				if(p.getPreco()>valor) {
					produtoMaisCaro = p;
					valor = p.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public  Produtos obterProdutoMaisBarato() {
		Produtos produtoMaisBarato= null;
		double valor= Double.MAX_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produtos p: estoqueProdutosMap.values()) {
				if(p.getPreco()<valor) {
					valor=p.getPreco();
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produtos maiorQuantidade = null;
		double maiorTotalEstoque = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Map.Entry<Long, Produtos>entry : estoqueProdutosMap.entrySet()) {
				double maiorValorEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if(maiorValorEstoque > maiorTotalEstoque) {
					maiorTotalEstoque = maiorValorEstoque;
					maiorQuantidade = entry.getValue();
				}
			}
			
		}
		return maiorQuantidade;
	}
	
	
	
	public static void main(String[] args) {
		
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1, "coca", 10, 10.50);
		estoqueProdutos.adicionarProduto(2, "bolacha", 10000, 2.50);
		estoqueProdutos.adicionarProduto(3, "queijo", 50, 30.0);
		
		estoqueProdutos.exibirProdutos();
		
		System.out.println(estoqueProdutos.calcularValorTotalEstoque());
		System.out.println(estoqueProdutos.obterProdutoMaisCaro());
		System.out.println(estoqueProdutos.obterProdutoMaisBarato());
		
		System.out.println("----------------------------------------");
		System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}

}
