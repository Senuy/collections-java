package list.OperacoesBasicas;

public class main {

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos é : "+ listaTarefa.obterNumeroTotalTarefas());
		
		
		//listaTarefa.adcionarTarefa("Tarefa 1");
		//listaTarefa.adcionarTarefa("Tarefa 1");
		//listaTarefa.adcionarTarefa("Tarefa 2");
		
		System.out.println("O numero total de elementos é : "+ listaTarefa.obterNumeroTotalTarefas());
		
		
		//listaTarefa.removerTarefa("Tarefa 1");
		
		System.out.println("O numero total de elementos é : "+ listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	
	}

}
