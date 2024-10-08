package set.operacoesBasicas;

import java.util.Objects;

public class Convidado {

	private String nome;
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	




	public String toString() {
		return String.format("Convidado [nome=%s, codigoConvite=%s]", nome, codigoConvite);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Convidado)) {
			return false;
		}
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

}
