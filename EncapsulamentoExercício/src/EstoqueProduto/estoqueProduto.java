package EstoqueProduto;

class Produto {
	
	private String descricao;
	private int quantidade;
	private double valor;
	
	public Produto(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
}
