package ExerciciosAula06;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		int a;
		
		Animal animal1 = new Animal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo ();
		Pregui�a pregui�a = new Pregui�a();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha a op��o referente ao animal que deseja:");
		System.out.println();
		System.out.println("1 - Cachoro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Pregui�a");
		
		a = entrada.nextInt();
		
		if (a == 1) {
		
		animal1.setNome("Bob");
		animal1.setIdade("3");
		cachorro.setMovimento("Correr");

		
		System.out.println();
		
		System.out.println("O nome do animal �: " + animal1.getNome());
		System.out.println("O animal tem " + animal1.getIdade() + " anos");
		System.out.println("O movimento que o animal faz �: " + cachorro.getMovimento());
		System.out.print("O som que o animal emite �: " ); 
		cachorro.latir();
		}
		else if (a == 2) {
			
			animal1.setNome("Pocoto");
			animal1.setIdade("7");
			cavalo.setMovimento("Correr");
			
			System.out.println();
			
			System.out.println("O nome do animal �: " + animal1.getNome());
			System.out.println("O animal tem " + animal1.getIdade() + " anos");
			System.out.println("O movimento que o animal faz �: " + cavalo.getMovimento());
			System.out.print("O som que o animal emite �: ");
			cavalo.som();
		}
		else if (a == 3) {
			
			animal1.setNome("Preguicinha");
			animal1.setIdade("10");
		
			pregui�a.setMovimento("Subir em arvore");
			
			System.out.println();
			
			System.out.println("O nome do animal �: " + animal1.getNome());
			System.out.println("O animal tem " + animal1.getIdade() + " anos");
			System.out.println("O movimento que o animal faz �: " + pregui�a.getMovimento());
			System.out.print("O som que o animal emite �: ");
			pregui�a.som();
		}
		else {
			System.out.println("OP��O INVALIDA");
		}
	
	}
}
