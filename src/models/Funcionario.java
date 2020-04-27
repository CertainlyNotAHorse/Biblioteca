package models;

public class Funcionario extends Pessoa{	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String codigo, String nome, String cpf) {
		super(codigo, nome, cpf);
	}

	@Override
	public String toString() {
		return  "\nCódigo: " + getCodigo() +
				"\nNome: " + getNome() + 
				"\nCPF: " + getCpf();
	}

}
