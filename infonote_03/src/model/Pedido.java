package model;

public class Pedido {

	private String dataEmissao;
	private String formaDePagamento;
	private String situacao;
	int numero;
	double valorTotal;

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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Pedido [\n dataEmissao=" + dataEmissao + ",\n formaDePagamento=" + formaDePagamento + ",\n situacao="
				+ situacao + ",\n numero=" + numero + ",\n valorTotal=" + valorTotal + "]";
	}

	public Pedido() {
		super();
	}

	public Pedido(int numero, String dataEmissao, double valorTotal, String situacao,String formaDePagamento) {
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

	}

}
