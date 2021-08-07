package Exercicio06;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria ();
	conta1.setAgencia("62");
	conta1.setNome("Danilo Pires da Silva");
	conta1.setNumero("1234543-7");
	conta1.setSaldo("$10.000");
	conta1.setBanco("Santander");
	
	
	System.out.println("Banco " + conta1.getBanco());
	System.out.println("Agencia " + conta1.getAgencia());
	System.out.println("Conta " + conta1.getNumero());
	System.out.println(conta1.getNome());
	System.out.println();
	System.out.println("Saldo de: " + conta1.getSaldo());
	}

}
