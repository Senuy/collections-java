package set.conjuntoPalavras;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoPalavrasUnicas {
	
	private Set<Palavra> palavraset;

	public ConjuntoPalavrasUnicas() {
		this.palavraset = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraset.add(new Palavra(palavra));
	}
	
	public void removerPalavra(String palavra) {
		Palavra palavraParaRemover = null;
		for(Palavra p : palavraset) {
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				palavraParaRemover = p;
				break;
			}

		}
		palavraset.remove(palavraParaRemover);
	}
	
	public void verificarPalavra(String palavra) {
		boolean encontrada = false;
		for(Palavra p: palavraset) {
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				System.out.println("A palavra: "+ palavra + " está no Conjunto");
				encontrada = true;
				break;
			}
		}
		
		if(!encontrada) {
			
			System.out.println("A palavra: "+ palavra + " não  está no Conjunto");
		}
		
	}
	public void exibirPalavrasUnicas() {
		System.out.println(palavraset);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		
		palavrasUnicas.adicionarPalavra("Tatu");
		palavrasUnicas.adicionarPalavra("Gilberto");
		palavrasUnicas.adicionarPalavra("Regua");
		palavrasUnicas.adicionarPalavra("Gilberto");
		palavrasUnicas.adicionarPalavra("Pesquisa");
		
		
		palavrasUnicas.removerPalavra("Pesquisa");
		palavrasUnicas.verificarPalavra("Roberto");
		
		palavrasUnicas.exibirPalavrasUnicas();
	}

}
