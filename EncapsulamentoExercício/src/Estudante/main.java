package Estudante;

public class main {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.setName("Samuel");
		estudante.setCourse("Tecnologia da Informacao");
		estudante.setCpf("111.222.333-00");
		estudante.setAge(23);
		
		estudante.ExibirCadastro();
	}

}
