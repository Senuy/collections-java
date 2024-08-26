package list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
	
	private List<Numero> numeroList;

	public SomaNumeros() {
		this.numeroList = new ArrayList<Numero>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Numero n: numeroList) {
			soma +=n.getNumero();
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		for(Numero n : numeroList) {
			if(n.getNumero()> maior) {
				maior = n.getNumero();
			}
		}
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int  menor = 99999999;
		for (Numero n: numeroList) {
			if(n.getNumero()<menor) {
				menor = n.getNumero();
			}
		}
		return menor;
	}
	
	public List exibirNumeros() {
		return numeroList;
	}
	
	public static void main(String[] args) {
	
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(55);
		somaNumeros.adicionarNumero(643);
		somaNumeros.adicionarNumero(878);
		somaNumeros.adicionarNumero(9784);
		somaNumeros.adicionarNumero(99847509);
		somaNumeros.adicionarNumero(-49837947);
		
		
		System.out.println(somaNumeros.calcularSoma());
		
		System.out.println("---------------------------------");
		
		System.out.println(somaNumeros.encontrarMaiorNumero());
		
		System.out.println("---------------------------------");
		
		System.out.println(somaNumeros.encontrarMenorNumero());
		
		System.out.println("---------------------------------");
		
		System.out.println(somaNumeros.exibirNumeros());
		
	}

}
