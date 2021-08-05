package ExerciciosAula03;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
	
		int idade = 0, pessoa = 1, pm21 = 0, pm50 = 0, enq = 0;
		
		while (enq < 20) {
			System.out.println("Escreva a idade da pessoa " + pessoa + ": ");
			idade = ler.nextInt();
			enq = enq + 1;
		if (idade < 21) {
			pm21 = pm21 + 1;
		}
		if (idade > 50 && idade < 99) {
			pm50 = pm50 + 1;
		}
		if (idade > 99) {
			System.out.println("\nIdade invalida!");
		}
		
		}
		System.out.println("\nO numero de pessoas com menos de 21 anos é de: " + pm21);
		System.out.println("\nO numero de pessoas com mais de 50 anos é de: " + pm50);
		
		ler.close();
		
		
	}

}
