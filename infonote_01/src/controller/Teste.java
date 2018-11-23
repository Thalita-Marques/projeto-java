package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

		Usuario user = new Usuario();
		user.setMatricula(894561);
		user.setLogin("thalita.marques");
		user.setNome("Thalita Marques");
		user.setSenha("1200");
		user.setEmail("thalita.marques@gmail");
		user.setTelefone("20445018");

		System.out.println("Matricula: " + user.getMatricula());
		System.out.println("Login: " + user.getLogin());
		System.out.println("Nome: " + user.getNome());
		System.out.println("Senha: " + user.getSenha());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Telefone: " + user.getTelefone());

		System.out.println("=========================================");

		Endereco edc = new Endereco();
		edc.setLogradouro("Praça da Sé");
		edc.setNumero("19");
		edc.setComplemento("Q 11, Lote 4");
		edc.setBairro("Jardim Primavera");
		edc.setCidade("Duque de Caxias");
		edc.setEstado("Rio de Janeiro");
		edc.setCep("22790-25");

		System.out.println("Logradouro: " + edc.getLogradouro());
		System.out.println("Número: " + edc.getNumero());
		System.out.println("Complemento: " + edc.getComplemento());
		System.out.println("Bairro: " + edc.getBairro());
		System.out.println("Cidade: " + edc.getCidade());
		System.out.println("Estado: " + edc.getEstado());
		System.out.println("Cep: " + edc.getCep());

		System.out.println("=========================================");

		Pedido pdd = new Pedido();
		pdd.setNumero(2010);
		pdd.setDataEmissao("08/12/1989");
		pdd.setFormaDePagamento("Cartão");
		pdd.setValorTotal("2,000");
		pdd.setSituacao("Em Andamento");

		System.out.println("Número: " + pdd.getNumero());
		System.out.println("Data Emissão: " + pdd.getDataEmissao());
		System.out.println("Forma de Pagamento: " + pdd.getFormaDePagamento());
		System.out.println("Valor Total: " + pdd.getValorTotal());
		System.out.println("Situação: " + pdd.getSituacao());

		System.out.println("=========================================");

		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());

		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());

		System.out.println("=========================================");

		Notebook Ntbk1 = new Notebook();
		Ntbk1.setNumeroNote(17);
		Ntbk1.setModelo("Windows 7");
		Ntbk1.setDescricao("Aparelho Eletronico");
		Ntbk1.setEstoque(80);
		Ntbk1.setPrecoUnitario("1,999");
		Ntbk1.setFigura("Coração");
		Ntbk1.setDataCadastro("07/12/1989");

		System.out.println("Numero Note: " + Ntbk1.getNumeroNote());
		System.out.println("Modelo: " + Ntbk1.getModelo());
		System.out.println("Descricao: " + Ntbk1.getDescricao());
		System.out.println("Estoque: " + Ntbk1.getEstoque());
		System.out.println("Preço Uinitário: " + Ntbk1.getPrecoUnitario());
		System.out.println("Figura: " + Ntbk1.getFigura());
		System.out.println("Data Cadastro: " + Ntbk1.getDataCadastro());

		System.out.println("=========================================");

		Notebook Ntbk2 = new Notebook();
		Ntbk2.setNumeroNote(15);
		Ntbk2.setModelo("Windows 10");
		Ntbk2.setDescricao("Aparelho Eletronico");
		Ntbk2.setEstoque(100);
		Ntbk2.setPrecoUnitario("3,000");
		Ntbk2.setFigura("Flor");
		Ntbk2.setDataCadastro("05/12/1989");

		System.out.println("Numero Note: " + Ntbk2.getNumeroNote());
		System.out.println("Modelo: " + Ntbk2.getModelo());
		System.out.println("Descricao: " + Ntbk2.getDescricao());
		System.out.println("Estoque: " + Ntbk2.getEstoque());
		System.out.println("Preço Uinitário: " + Ntbk2.getPrecoUnitario());
		System.out.println("Figura: " + Ntbk2.getFigura());
		System.out.println("Data Cadastro: " + Ntbk2.getDataCadastro());

		System.out.println("=========================================");

		Notebook Ntbk3 = new Notebook();
		Ntbk3.setNumeroNote(10);
		Ntbk3.setModelo("Windows 8");
		Ntbk3.setDescricao("Aparelho Eletronico");
		Ntbk3.setEstoque(150);
		Ntbk3.setPrecoUnitario("2,500");
		Ntbk3.setFigura("Bola");
		Ntbk3.setDataCadastro("02/12/1989");

		System.out.println("Numero Note: " + Ntbk3.getNumeroNote());
		System.out.println("Modelo: " + Ntbk3.getModelo());
		System.out.println("Descricao: " + Ntbk3.getDescricao());
		System.out.println("Estoque: " + Ntbk3.getEstoque());
		System.out.println("Preço Uinitário: " + Ntbk3.getPrecoUnitario());
		System.out.println("Figura: " + Ntbk3.getFigura());
		System.out.println("Data Cadastro: " + Ntbk3.getDataCadastro());

	}

}
