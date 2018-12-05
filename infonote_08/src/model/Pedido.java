package model;

public class Pedido {

	private String numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private String situacao;
	private double valorTotal;
    private Endereco enderecoEntrega;
	private ItemDePedido itens[];

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	
	public ItemDePedido[] getItens() {
		return itens;
	}

	public void setItens(ItemDePedido[] itens) {
		this.itens = itens;
	}

	public Pedido() {
		super();
	}

	public Pedido(String numeroPedido, String dataEmissao, double valorTotal, String formaDePagamento, String situacao, Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.valorTotal = valorTotal;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;

	}

	@Override
	public String toString() {
	final String ENTER = "\n";
	String retValue = "";
	retValue = "Informações sobre Pedido:" + ENTER +
	"Número do Pedido: " + numeroPedido + ENTER +
	"Data de Emissão: " + dataEmissao + ENTER +
	"Forma de pagamento: " + formaDePagamento + ENTER +
	"Valor Total: " + valorTotal + ENTER +
	"Situação: " + situacao + ENTER +
	"Endereço de Entrega: " + ENTER +
	"Itens: ";
	for (int i = 0; i < itens.length; i++){
	retValue += itens[i] + ENTER;
	}
	return retValue;
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