package testes;

import entidades.Categoria;
import persistencia.CategoriaDAO;

public class TesteCategoria {
	public static void main(String[] args) {
		
		Categoria categoria = new Categoria();
		categoria.setNome("Com�dia");
		categoria.setTipo("F");
		
		//CategoriaDAO.inserir(categoria);
		categoria.setId(1);
		System.out.println(CategoriaDAO.alterar(categoria));
	}
	
}
