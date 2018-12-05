package model;

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

}

