package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int telefone) {
		 contatoSet.add(new Contato(nome, telefone));
	}
	
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoTelefone) {
		Contato  contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setTelefone(novoTelefone);
				contatoAtualizado =c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos =  new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Yunes", 47945649);
		agendaContatos.adicionarContato("Yunes", 0);
		agendaContatos.adicionarContato("Yunes Santos", 123456);
		agendaContatos.adicionarContato("Gilberto", 465468);
		agendaContatos.adicionarContato("Luiza", 46546456);

		
		agendaContatos.exibirContatos();
		
		
		System.out.println(agendaContatos.pesquisarPorNome("Yunes"));
		
		
		System.out.println("Contato atualizado"+ agendaContatos.atualizarNumeroContato("Luiza", 1111111));
		System.out.println(agendaContatos.pesquisarPorNome("Luiza"));
	}


}
