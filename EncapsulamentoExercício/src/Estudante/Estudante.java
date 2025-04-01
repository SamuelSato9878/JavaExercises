package Estudante;

public class Estudante {
    private String name;
    private String course;
    private String cpf;
    private int age;


    public Estudante() {
        this.name = "Desconhecido";
        this.course = "Não informado";
        this.cpf = "000.000.000-00";
        this.age = 0;
    }


    public Estudante(String name, String course, String cpf, int age) {
        this.name = name;
        this.course = course;
        this.cpf = cpf;
        this.age = age;
    }


    public void setName(String name) { 
    	this.name = name;
    }
    public void setCourse(String course) { 
    	this.course = course;
    }
    public void setCpf(String cpf) { 
    	this.cpf = cpf; 
    }
    public void setAge(int age) { 
    	this.age = age;
    }

    public void ExibirCadastro() {
        System.out.println("Nome: " + name);
        System.out.println("Curso: " + course);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + age);
    }
}
