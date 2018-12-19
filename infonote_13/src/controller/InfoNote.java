package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Locale;

import model.*;
import model.DAO.*;
import util.*;

public class InfoNote {

	Usuario usuario;

	private static Cliente clienteGlobal = null;
	@SuppressWarnings("unused")
	private static Funcionario funcionarioGlobal = null;

	Cliente cliente;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;

	Configurador config;
	Ajuda ajuda;

	boolean logado = false;

	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;

	public static boolean isNumeric(String str) {

		try {
			@SuppressWarnings("unused")
			int i = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public void cadastrarUsuario() {
		System.out.println("==================================================");
		System.out.println(" InfoNote - Cadastro de Usuários. ");
		System.out.println("==================================================");

		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");

		int tipo = 0;

		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
		}

		String codigoCliente = Teclado.lerTexto("Codigo Cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Numero: ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");

		System.out.println("==================================================");

		String cep = Teclado.lerTexto("Cep: ");

		usuario = UsuarioDAO.inserir(login, senha, tipo);

		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome, email, telefone);

		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento, bairro, cidade, estado, cep,
				codigoCliente);

		clienteGlobal = cliente;

		System.out.println("==================================================");
		System.out.println(" Usuario Cadastrado Com Sucesso. ");
		System.out.println("==================================================");
		System.out.println(cliente);
		System.out.println(endereco);
	}

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println(" InfoNote - Se não é info não vendemos. "
				+ DateFormat.getDateInstance(DateFormat.SHORT).format(new Date(0)) + " "
				+ DateFormat.getTimeInstance().format(new Date(0)));

		if (logado == true) {
			System.out.println("Seja bem vindo, " + clienteGlobal.getNomeInvertido());
		}

		System.out.println("==================================================");

		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Área Administrativa");
		System.out.println("10 - Sair");
	}

	public void efetuarLogin() {

		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);

		if (clienteGlobal != null) {

			logado = clienteGlobal.validarLogin(login, senha);

		} else {

			if (logado) {

				System.out.println("Login efetuado com sucesso!");

			} else {

				System.out.println("Usuário ou senha inválido.");
			}

			int opcao2 = 3;
			do {

				System.out.println("Digite:");
				System.out.println("1 - Para efetuar Login");
				System.out.println("2 - Para cadastrar-se");
				System.out.println("3 - Para sair do sistema");

				opcao2 = Teclado.lerInt("");

				switch (opcao2) {

				case 1:
					efetuarLogin();

				case 2:
					cadastrarUsuario();
					break;

				case 3:
					System.out.println("Obrigado e volte sempre!");
					break;

				default:

					System.out.println("Opção inválida");
				}

			} while (!logado);
		}
	}
	
	public void cadastrarNotebook() {
		System.out.println("==================================================");
		System.out.println(" InfoNote - Cadastro do Notebook. ");
		System.out.println("==================================================");


		String serialNote = Teclado.lerTexto("Serial do Note: ");
		String modelo = Teclado.lerTexto("Modelo: ");
		String descricao = Teclado.lerTexto("E-mail: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preco Unitario: ");
		String figura = Teclado.lerTexto("Figura: ");
		String dataCadastro = Teclado.lerTexto("Data de Casdatro: ");
	

		System.out.println("==================================================");

		Notebook notebook = NotebookDAO.inserir(serialNote, modelo, descricao, estoque, precoUnitario , figura,
				dataCadastro);

		System.out.println("==================================================");
		System.out.println(" Notebook Cadastrado Com Sucesso. ");
		System.out.println("==================================================");
		System.out.println(notebook);
		
	}

	public void buscarNotebook() {
		
		System.out.println("buscarNotebook - Em Contrução");
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getSerialNote() + "-----" + notebooks[i].getModelo());
			}
		}
	}
	
   public void buscarNotebooks() {
		
		System.out.println("buscarNotebooks - Em Contrução");
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(
						notebooks[i].getSerialNote() + "-----" + 
				        notebooks[i].getModelo() + "-----" + 
						notebooks[i].getDescricao() + "-----" + 
				        notebooks[i].getEstoque() + "-----" + 
						notebooks[i].getPrecoUnitario() + "-----" + 
				        notebooks[i].getFigura() + "-----" + 
						notebooks[i].getDataCadastro());
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

	public void ajuda() {
		System.out.println(ajuda.getTexto());
	}

	public static void main(String[] args) {

		InfoNote info = new InfoNote();
		int opcao = SAIR;

		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");

			switch (opcao) {

			case LOGIN:
				info.efetuarLogin();
				break;

			case CADASTRAR_USUARIO:
				info.cadastrarUsuario();
				break;

			case BUSCAR_NOTEBOOK:
				info.buscarNotebook();
				break;

			case INSERIR_NOTEBOOK:
				info.manterCarrinho();
				break;

			case REMOVER_NOTEBOOK:
				info.manterCarrinho();
				break;

			case VER_CARRINHO:
				info.manterCarrinho();
				break;

			case EFETUAR_COMPRA:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;

				} else {
					info.efetuarCompra();
					break;
				}

			case AJUDA:
				info.ajuda();
				break;

			case AREA_ADMINISTRATIVA:
				info.areaAdministrativa();
				break;

			case SAIR:
				System.out.println("Saída do Sistema");
				break;

			default:
				System.out.println("Opção inválida!");
			}

			Teclado.lerTexto("Pressione uma tecla para continuar...");

		} while (opcao != SAIR);
	}

	public InfoNote() {

		config = new Configurador();

		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));

		ajuda = new Ajuda(config.getArquivoAjuda());

	}

	public void efetuarLoginAdm() {
		String login, senha;

		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);

		if (funcionario != null) {

			logado = funcionario.validarLogin(login, senha);

		} else {

			if (logado) {

				System.out.println("Login efetuado com sucesso!");

			} else {

				System.out.println("Usuário ou senha inválido.");
			}
		}
	}

	public void areaAdministrativa() {

		InfoNote info = new InfoNote();
		efetuarLoginAdm();

		System.out.println("Opções Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");
		
		int opcao = 5;
		do {
			
			opcao = Teclado.lerInt("Digite sua opção: ");
			switch (opcao) {
			
			case 1:
				info.cadastrarNotebook();
				break;
				
			case 2:
				info.mostrarNotebooks();
				break;
				
			case 3:
				info.editarNotebook();
				break;
				
			case 4:
				info.excluirNotebook();
				break;
				
			case 5:
				System.out.println("Saída do Sistema");
				break;
				
			default:
				
				System.out.println("Opção inválida!");
				
			}
			
			Teclado.lerTexto("Pressione uma tecla para continuar...");
			
		} while (opcao != 5);
	}
}
