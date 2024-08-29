package map.ordenacao.agenda;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate,Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	
	}
	
	public void obterProximoEvento() {
		/*Set<LocalDate> dateSet = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values();*/
		//eventosMap.get()
		
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O Próximo evento "+entry.getValue()+" acontecera na data"+entry.getKey());
				break;
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 1),"filme","deadpool");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 15),"show","rock");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 3),"exposicao","varias atracoes");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 3),"exposicao","varias atracoes");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
	
	
	
	
	
}
