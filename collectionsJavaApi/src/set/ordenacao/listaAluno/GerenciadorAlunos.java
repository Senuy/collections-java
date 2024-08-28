package set.ordenacao.listaAluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {
	
	private Set <Aluno> alunoSet;

	public GerenciadorAlunos() {
		alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		for( Aluno a: alunoSet ) {
			if (a.getMatricula() == matricula) {
				alunoParaRemover = a;
				break;
			}
		}
		alunoSet.remove(alunoParaRemover);
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> AlunosPorNome = new TreeSet<>(alunoSet);
		return AlunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
		alunoPorNota.addAll(alunoSet);
		return alunoPorNota;
	}
	
	public void exibirAlunos() {
		System.out.println(alunoSet);
		
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciaAlunos = new GerenciadorAlunos();
		
		gerenciaAlunos.exibirAlunos();
		
		gerenciaAlunos.adicionarAluno(" Antonio" , 4684648, 5.00);
		gerenciaAlunos.adicionarAluno(" Yunes S" , 4684648, 9.00);
		gerenciaAlunos.adicionarAluno(" Yunes Santos" , 468454648, 10.00);
		gerenciaAlunos.adicionarAluno(" Maria Santos" , 45848, 7.00);
		
		
		gerenciaAlunos.exibirAlunos();

		gerenciaAlunos.removerAluno(45848);
		
		gerenciaAlunos.exibirAlunos();
		
		//System.out.println(gerenciaAlunos.exibirAlunosPorNome());
		
		
		//System.out.println(gerenciaAlunos.exibirAlunosPorNota());


	}
	

}
