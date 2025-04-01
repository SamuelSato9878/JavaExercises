package Estudante;

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
		
		if(quantidade < 0) {
			System.out.println("Tente de novo");
		}else {
			this.quantidade = quantidade;
		}
	}
	public int getQuantidade() {
		
		return quantidade;
	}
	
	public void setValor(double valor) {
		
		if(quantidade < 0) {
			System.out.println("Tente de novo");
		}else {
			this.valor = valor;
		}
	}
	public double getValor() {
		return valor;
	}
}
