package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	//atributo
	
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return  numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		
		agendaContatos.adicionarContato("Yunes", 99999999);
		agendaContatos.adicionarContato("Yunes", 999954845);//put além de add, ele atualiza um valor conforme key
		agendaContatos.adicionarContato("Claudia", 99999999);
		agendaContatos.adicionarContato("Juliana", 99999999);
		agendaContatos.adicionarContato("Rogerio", 99999999);
		agendaContatos.adicionarContato("Julio", 99999999);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Yunes");
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Juliana"));
		
	}

}
