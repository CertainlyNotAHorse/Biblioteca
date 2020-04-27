package models;

public class Pessoa {
	
	private String codigo;
	private String nome;
	private String cpf;
	
	public Pessoa(String codigo, String nome, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa (){
		
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
