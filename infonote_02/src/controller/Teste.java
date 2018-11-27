package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		Usuario user = new Usuario(1, "joseph", "climber", "Joseph Climber", "josephclimber@gmail.com", "2222-3344");
		
		// Mostrar Usuário
		user.mostrar();

		System.out.println("=========================================");

		Endereco edc = new Endereco("Praça da Sé", "19", "Q 11 Lote 4", "Jardim Primavera", "Duque de Caxias"," Rio de Janeiro", "22790-25");
		edc.mostrar();

		System.out.println("=========================================");

		Pedido pdd = new Pedido(2010, "08/12/1989", 2.000, "Em Andamento", "Cartão");
		pdd.mostrar();
		
		System.out.println("=========================================");

		ItemDePedido Idp1 = new ItemDePedido(2, 22.98);
		Idp1.mostrar();

		ItemDePedido Idp2 = new ItemDePedido(1, 98.75);
		Idp2.mostrar();

		System.out.println("=========================================");

		Notebook Ntbk1 = new Notebook(17, "Windows 7", "Aparelho Eletronico", 80, 1.999, "Coração", "07/12/1989" );
		Ntbk1.mostrar();

		System.out.println("=========================================");

		Notebook Ntbk2 = new Notebook(15, "Windows 10", "Aparelho Eletronico", 100, 3.000, "Flor", "05/12/1989");
		Ntbk2.mostrar();

		System.out.println("=========================================");

		Notebook Ntbk3 = new Notebook(10, "Windows 8", "Aparelho Eletrônico", 150, 2.500, "Bola", "02/12/1989");
		Ntbk3.mostrar();
	}

}
