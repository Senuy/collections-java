package list.Ordenacáo.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.Ordenacáo.OrdenacaoPessoas.*;

import list.Pesquisa.CatalogoLivros.main;

public class OrdenacaoPessoas {

	//atributo
	
	private List<Pessoa> pessoalist;

	public OrdenacaoPessoas() {
		this.pessoalist = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoalist.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalist);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalist);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
		
		ordenacaoPessoa.adicionarPessoa("Yunes", 29, 1.75);
		ordenacaoPessoa.adicionarPessoa("Sara", 22, 1.50);
		ordenacaoPessoa.adicionarPessoa("Guilherme", 20, 1.80);
		ordenacaoPessoa.adicionarPessoa("Gumercinda", 50, 1.70);
		ordenacaoPessoa.adicionarPessoa("Jiacomo", 29, 1.75);
		ordenacaoPessoa.adicionarPessoa("Tereza", 44, 1.55);
		
		System.out.println(ordenacaoPessoa.pessoalist);
		System.out.println("----------------------------------------------------");
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println("----------------------------------------------------");
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
	
}
