package set.ordenacao.listaAluno;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	@Override
	public int compareTo(Aluno a) {
	
		return nome.compareToIgnoreCase(a.getNome()) ;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return String.format("Aluno [nome=%s, matricula=%s, nota=%s]", nome, matricula, nota);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Aluno)) {
			return false;
		}
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
}


class ComparatorPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno n1, Aluno n2) {
		return Double.compare(n1.getNota(), n2.getNota());
	}

	
}

