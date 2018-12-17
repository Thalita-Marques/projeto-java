package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ItemDePedido {

	private int qtde;
	private double subtotal;

	private Notebook notebook;

	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public int getQtde() {
		return qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}

	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}
	
	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	
	retValue = "Informações sobre o Item de Pedido:" + ENTER +
	"Qtde: " + qtde + ENTER +
	"Subtotal: " + subtotal + ENTER +
	"Notebook: " + notebook + ENTER;
	return retValue;
	}
	
    public static void main(String[] args) {
		
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 53008.812;
		System.out.println("Sem formatação: " + valor);
		System.out.println("Formatado: " + f.format(valor));
		
		NumberFormat n = NumberFormat.getNumberInstance();
		double numero = 200.70;
		System.out.println("Sem formatação: " + numero);
		System.out.println("Formatado: " + n.format(numero));
		double valor2 = 18003.1;
		
		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.println("Sem formatação: " + valor2);
		System.out.println("Formatado: " + df.format(valor2));
	}

}

