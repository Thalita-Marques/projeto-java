package model;

public class Pedido {

	private int numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private String situacao;
	private double valorTotal;
    private Endereco enderecoEntrega;
	private ItemDePedido itens[];

	public int getNumero() {
		return numero;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Pedido [\n dataEmissao=" + dataEmissao + ",\n formaDePagamento=" + formaDePagamento + ",\n situacao="
				+ situacao + ",\n numero=" + numero + ",\n valorTotal=" + valorTotal + "]";
	}

	public Pedido() {
		super();
	}

	public Pedido(int numero, String dataEmissao, double valorTotal, String situacao, String formaDePagamento) {
		super();
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.situacao = situacao;

	}

	public void mostrar() {

		System.out.println("`\n\nPedido:\n");
		System.out.println("Numero: " + this.numero);
		System.out.println("Valor Total: " + this.valorTotal);
		System.out.println("Data Emissão: " + this.dataEmissao);
		System.out.println("Forma De Pagamento: " + this.formaDePagamento);
		System.out.println("Situação: " + this.situacao);
		
		System.out.println("\n\nItens do Pedido:\n");
		for (int i = 0; i < itens.length; i++){
			if (itens[i] != null) {
				itens[i].mostrar();
			}
		}

	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}
}