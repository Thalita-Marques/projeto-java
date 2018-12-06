package controller;

import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import util.GerarSenha;
import util.Teclado;

public class InfoNote {
	
	private static Cliente clienteGlobal = null;
	private static Funcionario funcionarioGlobal = null;

	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;

	boolean logado = false;

	public InfoNote() {

		notebooks[0] = new Notebook("1", "Negativo N22BR", "CPU Intel Core 2 Duo, Memória 2 GB, HD 250 GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2011");

		notebooks[1] = new Notebook("2", "Bell B55BR", "CPU Intel I3, Memória 4 GB, HD 500 GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2011");

		notebooks[2] = new Notebook("3", "Pompaq P41BR", "CPU Intel I3, Memória 3 GB, HD 320 GB", 1, 1600.00,
				"img\\p41br.jpg", "21/05/2011");

		notebooks[3] = new Notebook("4", "CCF CR71CH", "CPU Intel Dual Core, Memória 2 GB, HD 160 GB", 5, 1100.00,
				"img\\cr71ch.jpg", "10/06/2011");

		notebooks[4] = new Notebook("5", "BradescoTech BD22BR", "CPU ADM Phenon II, Memória 4 GB, HD 160 GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2011");

	}
	
	public void cadastrarUsuario() {
		System.out.println("==================================================");
		System.out.println(" InfoNote - Cadastro de Usuários. ");
		System.out.println("==================================================");
		
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		int tipo = 1;
		String codigoCliente = Teclado.lerTexto("Codigo Cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");
		
		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Numero: ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro =Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		
		System.out.println("==================================================");
		
		String cep = Teclado.lerTexto("Cep: ");
		if (senha.equals("") || senha == null) {
		senha = GerarSenha.gerarSenha();
		System.out.println("Senha gerada: " + senha);
	}
		
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep );
		
		Cliente cliente = new Cliente(login, senha, tipo, codigoCliente, nome, email, telefone, endereco);
		clienteGlobal = cliente;
		
		System.out.println("==================================================");
		System.out.println(" Usuario Cadastrado Com Sucesso. ");
		System.out.println("==================================================");
		System.out.println(cliente);
		System.out.println(endereco);
	}

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println(" InfoNote - Se não é info não vendemos. ");
		
		if (logado == true) {
			System.out.println("Seja bem vindo, " + clienteGlobal.getNomeInvertido());
		}
		
		System.out.println("==================================================");
		
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		
		if (clienteGlobal != null) {
			
		logado = clienteGlobal.validarLogin(login, senha);
		if (logado) {
			
		System.out.println("Login efetuado com sucesso!");
		
		} else {
			
		System.out.println("Usuário ou senha inválido.");
		}
		
	}
	else
	{
		
		logado = funcionarioGlobal.validarLogin(login, senha);
		if (logado) {
			
		System.out.println("Login efetuado com sucesso!");
		
		} else {
			
		System.out.println("Usuário ou senha inválido.");
		}
	}
}

	public void buscarNotebook() {
		System.out.println("buscarNotebook - Em Contrução");
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getSerialNote() + "-----" + notebooks[i].getModelo());
			}
		}
	}

	public void inserirNotebook() {

		String serialNote = Teclado.lerTexto("Informe o número do notebook" + " para compra: ");

		if (pedido == null) {
			pedido = new Pedido();
		}

		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && serialNote.equals(notebooks[i].getSerialNote())) {
				aux = notebooks[i];
			}
		}

		if (aux == null) {
			return;
		}

		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

		pedido.inserirItem(item);
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Contrução");
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Contrução");
	}

	public static void main(String[] args) {

		InfoNote info = new InfoNote();

		int opcao = 8;

		info.mostrarMenu();
		opcao = Teclado.lerInt("Digite sua opção: ");

		switch (opcao) {

		case 1:
			info.efetuarLogin();
			break;

		case 2:
			info.cadastrarUsuario();
			break;

		case 3:
			info.buscarNotebook();
			break;

		case 4:
			info.manterCarrinho();
			break;

		case 5:
			info.manterCarrinho();
			break;

		case 6:
			info.manterCarrinho();
			break;

		case 7:
			if (!info.logado) {
				System.out.println("Efetue login para efetuar compra.");
				break;
			} else {
				info.efetuarCompra();
				break;
			}
		case 8:
			System.out.println("Saida do Sistema.");

		default:
			System.out.println("Opção inválida!");
		}
		Teclado.lerTexto("Pressione uma tecla para continuar...");

		do {

		} while (opcao != 8);
	}
}