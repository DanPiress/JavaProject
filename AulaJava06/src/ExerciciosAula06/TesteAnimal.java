package ExerciciosAula06;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		int a;
		
		Animal animal1 = new Animal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo ();
		Preguiça preguiça = new Preguiça();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha a opção referente ao animal que deseja:");
		System.out.println();
		System.out.println("1 - Cachoro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Preguiça");
		
		a = entrada.nextInt();
		
		if (a == 1) {
		
		animal1.setNome("Bob");
		animal1.setIdade("3");
		cachorro.setMovimento("Correr");

		
		System.out.println();
		
		System.out.println("O nome do animal é: " + animal1.getNome());
		System.out.println("O animal tem " + animal1.getIdade() + " anos");
		System.out.println("O movimento que o animal faz é: " + cachorro.getMovimento());
		System.out.print("O som que o animal emite é: " ); 
		cachorro.latir();
		}
		else if (a == 2) {
			
			animal1.setNome("Pocoto");
			animal1.setIdade("7");
			cavalo.setMovimento("Correr");
			
			System.out.println();
			
			System.out.println("O nome do animal é: " + animal1.getNome());
			System.out.println("O animal tem " + animal1.getIdade() + " anos");
			System.out.println("O movimento que o animal faz é: " + cavalo.getMovimento());
			System.out.print("O som que o animal emite é: ");
			cavalo.som();
		}
		else if (a == 3) {
			
			animal1.setNome("Preguicinha");
			animal1.setIdade("10");
		
			preguiça.setMovimento("Subir em arvore");
			
			System.out.println();
			
			System.out.println("O nome do animal é: " + animal1.getNome());
			System.out.println("O animal tem " + animal1.getIdade() + " anos");
			System.out.println("O movimento que o animal faz é: " + preguiça.getMovimento());
			System.out.print("O som que o animal emite é: ");
			preguiça.som();
		}
		else {
			System.out.println("OPÇÃO INVALIDA");
		}
	
	}
}
