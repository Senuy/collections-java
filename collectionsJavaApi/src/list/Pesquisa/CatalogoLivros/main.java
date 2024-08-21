package list.Pesquisa.CatalogoLivros;

public class main {

	public static void main(String[] args) {
		CatalogoLivros catalogoLIvros = new CatalogoLivros();
		
		catalogoLIvros.adicionarLivro("LIvro1","Autor1", 2051);
		catalogoLIvros.adicionarLivro("LIvro1","Autor2", 2021);
		catalogoLIvros.adicionarLivro("LIvro2","Autor2", 2022);
		catalogoLIvros.adicionarLivro("LIvro3","Autor3", 2023);
		catalogoLIvros.adicionarLivro("LIvro4","Autor4", 1994);
		
		System.out.println(catalogoLIvros.pesquisarPorAutor("Autor2"));
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println(catalogoLIvros.pesquisarPorIntervaloAnos(2022, 2023));
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println(catalogoLIvros.pesquisarPorTitulo("LIvro1"));
	}

}
