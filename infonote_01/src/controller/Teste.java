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
		
		Pedido pdd = new Pedido();
		pdd.setNumero(2010);
		pdd.setDataEmissao("08/12/1989");
		pdd.setFormaDePagamento("Cartão");
		pdd.setValorTotal("2,000");
		pdd.setSituacao("Em Andamento");
		
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());
		
		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());
		
		Notebook Ntbk1 = Notebook();
		Ntbk1.setNumeroNote(17);
		Ntbk1.setModelo("Windows 7");
		Ntbk1.setDescricao("Aparelho Eletronico");
		Ntbk1.setEstoque(20);
		Ntbk1.setPrecoUnitario("1,500");
		Ntbk1.setFigura("Publica");
		Ntbk1.setDataCadastro("07/12/1989");
		
		System.out.println("Numero");
		

	}

	private static Notebook Notebook() {
		// TODO Auto-generated method stub
		return null;
	}

}
