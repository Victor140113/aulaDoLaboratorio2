package rh_codes;
public class Funcionario {
    // Encapsulamento
    private String nome;
    private String cpf;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Regra de Negócio Encapsulada
    public void aplicarAumento(double percentual){
        if (percentual > 0){
            this.salario +=this.salario * (percentual /100);
        }
    }
    
    // Método de Exibição de Dados
    public void exibirDados() {
    	System.out.println("Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSalário: " + this.salario + "\n");
    }
    
    // Getters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
}