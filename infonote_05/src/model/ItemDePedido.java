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

	@Override
	public String toString() {
		return "ItemDePedido [qtde=" + qtde + ", subtotal=" + subtotal + "]";
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

	public void mostrar() {
		// Mostrar Item de Pedido
		System.out.println("\n\nItemDePedido:\n");
		System.out.println("Qtde: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}

}

