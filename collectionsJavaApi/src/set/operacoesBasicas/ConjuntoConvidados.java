package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {

	// atributo

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;

		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidado = new ConjuntoConvidados();
		System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+ " convidados dentro do set Convidados");
		
		conjuntoConvidado.adicionarConvidado("Conviadado 1", 1234);
		conjuntoConvidado.adicionarConvidado("Conviadado 2", 1235);
		conjuntoConvidado.adicionarConvidado("Conviadado 3", 1235);
		conjuntoConvidado.adicionarConvidado("Conviadado 4", 1236);
		
		
		System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+ " convidados dentro do set Convidados");
		
		conjuntoConvidado.removerConvidadoPorCodigoConvite(1236);
		
		System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+ " covidados dentro do set Convidados");
		
		conjuntoConvidado.exibirConvidados();
	}
	
}

