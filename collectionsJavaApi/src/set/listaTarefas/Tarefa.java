package set.listaTarefas;

public class Tarefa {
	public String descricao;
	public boolean tarefaConcluida;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}

	public boolean isTarefaConcluida() {
		return tarefaConcluida;
	}

	@Override
	public String toString() {
		return String.format("Tarefa [descricao=%s, tarefaConcluida=%s]", descricao, tarefaConcluida);
	}

}
