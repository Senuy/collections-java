package list.ordenacao.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
	
	List <Numero> numeroList;

	public OrdenacaoNumeros() {
		numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public void ordenarAscendente() {
		
	}
	
	
	

}
