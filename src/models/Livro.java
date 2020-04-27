package models;

public class Livro {
	
	private String codlivro;
	private String titulo;
	private String editora;
	private String autor;
	private String assunto;
	private String idioma;
	private String situa��o;
	public String getCodlivro() {
		return codlivro;
	}
	public void setCodlivro(String codlivro) {
		this.codlivro = codlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getSitua��o() {
		return situa��o;
	}
	public void setSitua��o(String situa��o) {
		this.situa��o = situa��o;
	}
	
	@Override
	public String toString() {
		return "C�digo do livro: " + this.codlivro +
				"\nT�tulo: " + this.titulo + 
				"\nEditora: " + this.editora +
				"\nAutor: " + this.autor +
				"\nAssunto " + this.assunto +
				"\nIdioma " + this.idioma +
				"\nSitua��o " + this.situa��o;
	}

}
