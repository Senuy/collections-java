package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}

	private void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}

	private void removerPalavra(String palavra) {

		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}

	}

	private void exibirPalavras() {
		System.out.println(dicionarioMap);
	}

	private String pesquisarPorPalavra(String palavra) {
		String palavraPesquisada = null;
		if (!dicionarioMap.isEmpty()) {
			palavraPesquisada=dicionarioMap.get(palavra);
		}
		return palavraPesquisada;
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("ate", "em breve");
		dicionario.adicionarPalavra("agir", "fazer");
		dicionario.adicionarPalavra("alto", "grande");
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("ate");
		dicionario.exibirPalavras();
		
		System.out.println(dicionario.pesquisarPorPalavra("alto"));
	}

}
