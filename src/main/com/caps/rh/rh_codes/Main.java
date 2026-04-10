package rh_codes;
public class Main {
	
	public static void main (String[] args){
        
		// Código Teste
		
		/// Instanciando Funcionários
		Funcionario a = new Funcionario("Pam Beesly", "92983712134", 1000);
		Funcionario b = new Gerente("Michael Scott", "10419242213", 3544, 250);
		
		/// Exibindo Dados
		a.exibirDados();
		b.exibirDados();
		
		/// Aplicando Aumento
		a.aplicarAumento(10);
		a.exibirDados();
		
    }
}