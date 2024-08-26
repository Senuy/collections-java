package list.OperacoesBasicas.CarrinhoCompras;

public class Main {

	public static void main(String[] args) {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.calcularValorTotal();
		//carrinho.exibirItens();
		
		
		carrinho.adicionarItem("Coca", 10.50, 3);
		carrinho.adicionarItem("Sal", 2.00, 1);
		carrinho.adicionarItem("Carne", 37.00, 3);
		carrinho.exibirItens();
		
		carrinho.calcularValorTotal();
		
		carrinho.removerItem("Coca");
		
		carrinho.exibirItens();
 		carrinho.calcularValorTotal();

	}

}
