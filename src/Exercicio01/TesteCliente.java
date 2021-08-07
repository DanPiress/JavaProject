package Exercicio01;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		
		
		cliente1.setNome("Caio Matheus Souza"); 
		cliente1.setCidade("Poá - Sp");
		cliente1.setSexo("Masculino");
		cliente1.setAltura("1.89M");
		cliente1.setPeso("87kgs");
		cliente1.setIdade("22 anos");
		cliente1.setDocumento("123.456.789-00");
		
		System.out.println ("Cliente: " + cliente1.getNome());
		System.out.println ("Residente da cidade de: " + cliente1.getCidade());
		System.out.println ("Do sexo: " + cliente1.getSexo());
		System.out.println ("Possui: " + cliente1.getAltura() + " de altura");
		System.out.println ("Pesa: " + cliente1.getPeso());
		System.out.println ("Idade: " + cliente1.getIdade() + " anos");
		System.out.println ("Portador do CPF de numero: " + cliente1.getDocumento());
		}

	}
