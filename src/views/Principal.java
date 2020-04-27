package views;


//import dao.VendaDAO;
import models.Cliente;
//import models.Venda;
import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		do {
			System.out.println("\n -- PROJETO BIBLIOTECA --\n ");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Cadastrar funcionário");
			System.out.println("4 - Listar funcionários");
			System.out.println("5 - Cadastrar livro");
			System.out.println("6 - Acervo");
			/*System.out.println("7 - Cadastrar venda");
			System.out.println("8 - Lista vendas");
			System.out.println("9 - Listar vendas por Cliente");*/
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a opção escolhida: ");
			
			switch (opcao) {
			case 1:		
				CadastrarCliente.renderizar();
				break;
			case 2:
				ListarClientes.renderizar();
				break;
			case 3:		
				CadastrarFuncionario.renderizar();
				break;
			case 4:
				ListarFuncionarios.renderizar();
				break;
			case 5:		
				CadastrarLivro.renderizar();
				break;
/*			case 6:
				Acervo
				.renderizar();
				break;*/
//			case 7:
//				CadastrarVenda.renderizar();
//				break;
//			case 8:
//				ListarVendas.renderizar(VendaDAO.retornarVendas());
//				break;
//			case 9:
//				String cpf = Console.readString("Digite o CPF do cliente: ");
//				ListarVendas.renderizar(VendaDAO.retornarVendasPorCliente(cpf));
//				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
	}
}









