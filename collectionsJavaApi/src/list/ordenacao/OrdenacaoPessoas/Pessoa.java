package list.ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, p.getIdade());
	}


	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return String.format("Pessoa [nome=%s, idade=%s, altura=%s]", nome, idade, altura);
	}
	
	
}

class CompartorPorAltura implements Comparator<Pessoa>{ // para usar o comparator é necessário criar uma classe

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
