package views;

import dao.LivroDAO;
import models.Livro;
import utils.Console;

public class CadastrarLivro {
	
	private static Livro l = new Livro();
	
	public static void renderizar() {
		
		l = new Livro();
		
		System.out.println("\n -- CADASTRAR LIVRO --\n");
		
		l.setCodlivro(Console.readString("Digite o c�digo do livro: "));
		l.setTitulo(Console.readString("Digite o t�tulo do livro: "));
		l.setEditora(Console.readString("Digite a editora:"));
		l.setAutor(Console.readString("Digite o autor: "));
		l.setAssunto(Console.readString("Digite o assunto: "));
		l.setIdioma(Console.readString("Digite o idioma: "));
		l.setSitua��o(Console.readString("Digite a situa��o do livr"));
		
		if(LivroDAO.cadastrarLivro(l)) {
			System.out.println("\n -- LIVRO CADASTRADO --\n");
		}else {
			System.out.println("");
		}
		
	}

}
