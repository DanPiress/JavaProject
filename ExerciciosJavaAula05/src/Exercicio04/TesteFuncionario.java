package Exercicio04;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setSalario("$6.500");
		funcionario1.setFuncao("Programador");
		funcionario1.setIdade("22");
		funcionario1.setNome("Danilo Pires da Silva");
		
		
		System.out.println("O funcionario atende por: "  + funcionario1.getNome() + ".");
		System.out.println("O funcionario " + funcionario1.getNome() + " recebe: " + funcionario1.getSalario() + " por mês.");
		System.out.println("O funcionario " + funcionario1.getNome() + " exerce a função de: " + funcionario1.getFuncao() + ".");
		System.out.println("O funcionario " + funcionario1.getNome() + " tem: " + funcionario1.getIdade() + " anos.");
		
	}

}
