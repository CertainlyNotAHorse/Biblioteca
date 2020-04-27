package models;

public class Cliente extends Pessoa{
	
	public Cliente(String codigo, String nome, String cpf) {
		super(codigo,nome, cpf);
	}
	
	public Cliente() {}
	
	private String endereco;
	private String telefone;
	
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo() + 
				"\nNome: " + getNome() + 
				"\nCPF: " + getCpf() +
				"\nEndereço: " + getEndereco() +
				"\nTelefone: " + getTelefone();
	}
	

}
