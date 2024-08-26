package list.ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	// atributo

	private List<Pessoa> pessoalist;

	public OrdenacaoPessoas() {
		this.pessoalist = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoalist.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoalist);
		Collections.sort(pessoaPorIdade);

		return pessoaPorIdade;

	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoalist);
		Collections.sort(pessoaPorAltura, new CompartorPorAltura());// necessário criar nova instancia implementado na
																	// outra classe quando utilizado comparator
		return pessoaPorAltura;
	}

	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();
		
		
		ordenarPessoas.adicionarPessoa("Pessoa 1", 20, 1.75);
		ordenarPessoas.adicionarPessoa("Pessoa 2", 30, 1.80);
		ordenarPessoas.adicionarPessoa("Pessoa 3", 25, 1.70);
		ordenarPessoas.adicionarPessoa("Pessoa 4", 17, 1.56);
		
		System.out.println(ordenarPessoas.ordenarPorAltura());
		
		System.out.println("--------------------------------------");
		System.out.println(ordenarPessoas.ordenarPorIdade());
	}
}
