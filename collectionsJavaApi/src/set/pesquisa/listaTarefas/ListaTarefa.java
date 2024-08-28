package set.pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

	private Set<Tarefa> tarefaset;
	private Set<Tarefa> tarefaConcluida;
	private Set<Tarefa> tarefaPendente;

	public ListaTarefa() {
		this.tarefaset = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaset.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa t : tarefaset) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				break;
			}
		}
		tarefaset.remove(tarefaParaRemover);
	}

	public void exibirTarefas() {
		System.out.println(tarefaset);
	}

	public void contarTarefas() {
		System.out.println(tarefaset.size());
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		this.tarefaConcluida = new HashSet<>();

		for (Tarefa t : tarefaset) {
			if (t.isTarefaConcluida() == true) {
				tarefaConcluida.add(t);
			}
		}
		return tarefaConcluida;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		this.tarefaPendente = new HashSet<>();

		for (Tarefa t : tarefaset) {
			if (t.isTarefaConcluida() == false) {
				tarefaPendente.add(t);
			}
		}
		return tarefaPendente;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefaset) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
				break;
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : tarefaset) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(false);
				break;
			}
		}

	}

	public void limparListaTarefas() {
		tarefaset.clear();
	}

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		
		listaTarefa.adicionarTarefa("lavar louça");
		listaTarefa.adicionarTarefa("lavar roupa");
		listaTarefa.adicionarTarefa("licao de casa");
		listaTarefa.adicionarTarefa("estudar");
		listaTarefa.adicionarTarefa("dormir");
		
		listaTarefa.exibirTarefas();
		
		System.out.println("------------------------------------------");
		
		listaTarefa.removerTarefa("dormir");
		listaTarefa.exibirTarefas();
		listaTarefa.contarTarefas();
		
		System.out.println("------------------------------------------");
		
		System.out.println(listaTarefa.obterTarefasConcluidas());
		System.out.println("------------------------------------------");
		System.out.println(listaTarefa.obterTarefasPendentes());
		System.out.println("------------------------------------------");
		
		listaTarefa.marcarTarefaConcluida("lavar louça");
		listaTarefa.marcarTarefaConcluida("estudar");
		System.out.println(listaTarefa.obterTarefasConcluidas());
		System.out.println("------------------------------------------");
		
		listaTarefa.marcarTarefaPendente("estudar");
		System.out.println(listaTarefa.obterTarefasConcluidas());
		
		System.out.println("------------------------------------------");
		
		listaTarefa.limparListaTarefas();
		
		listaTarefa.exibirTarefas();
		
		
	}
}

