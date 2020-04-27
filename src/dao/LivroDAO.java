package dao;

import java.util.ArrayList;

import models.Livro;

public class LivroDAO {
	
	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public static Livro buscarLivroPorCodlivro(String codlivro) {
		for(Livro livroCadastrado : livros) {
			if(livroCadastrado.getCodlivro().equals(codlivro)) {
				return livroCadastrado;
			}
		}
		return null;
	}
	
	public static Boolean cadastrarLivro(Livro l) {
		if(buscarLivroPorCodlivro(l.getCodlivro()) == null) {
			livros.add(l);
			return true;
		}
		return false;
	}
	
	public static ArrayList<Livro> retornarLivros() {
		return livros;
	}
	 

}
