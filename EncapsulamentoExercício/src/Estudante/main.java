package Estudante;

public class main {

	public static void main(String[] args) {
		Produto produto = new Produto("", 0, 0);
		
		produto.setDescricao("Caixa de Leite");
		produto.setQuantidade(10);
		produto.setValor(7);
		
		System.out.println("Descricao:" + produto.getDescricao());
		System.out.println("Quantidade:" + produto.getQuantidade());
		System.out.println("Valor:" + produto.getValor());
	}

}
