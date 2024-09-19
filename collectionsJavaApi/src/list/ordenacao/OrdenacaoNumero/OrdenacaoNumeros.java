package list.ordenacao.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {
	
	List <Numero> numeroList;

	public OrdenacaoNumeros() {
		numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public List<Numero> ordenarAscendente() {
		List<Numero> NumAscendente = new ArrayList<>(numeroList);
		Collections.sort(NumAscendente);
		return NumAscendente;
	}
	
	public List<Numero> ordenarDescedente(){
		List <Numero> NumDescendente =  new ArrayList<>(numeroList);
		Collections.sort(NumDescendente.reversed());
		return NumDescendente;
	}

	public static void main(String[] args) {
		
		
		OrdenacaoNumeros ordNum = new OrdenacaoNumeros();
		ordNum.adicionarNumero(1);
		ordNum.adicionarNumero(78378);
		ordNum.adicionarNumero(1343);
		ordNum.adicionarNumero(2);
		ordNum.adicionarNumero(5);
		ordNum.adicionarNumero(3);
		ordNum.adicionarNumero(4);
		
		
		System.out.println(ordNum.ordenarAscendente());
		System.out.println(ordNum.ordenarDescedente());
		
		
	}
}

