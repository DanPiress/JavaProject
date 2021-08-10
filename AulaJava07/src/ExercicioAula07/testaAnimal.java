package ExercicioAula07;

import java.util.Scanner;

public class testaAnimal {

	public static void main(String[] args) {

		cachorro dog = new cachorro();
		cavalo pocoto = new cavalo();
		preguica preg = new  preguica();
		
		Scanner entrada = new Scanner(System.in);
		
		int ler;
		
		System.out.println("Digite a opção referente ao animal que deseja: ");
		System.out.println("1 - Cachorro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Preguiça");
		ler = entrada.nextInt();
		
		if (ler == 1) {
			dog.nomeAnimal();
			dog.idadeAnimal();
			dog.movimentoAnimal();
			dog.somAnimal();
		}
		
		else if (ler == 2) {
			pocoto.nomeAnimal();
			pocoto.idadeAnimal();
			pocoto.movimentoAnimal();
			pocoto.somAnimal();
		}
		else if (ler == 3) {
			preg.nomeAnimal();
			preg.idadeAnimal();
			preg.movimentoAnimal();
			preg.somAnimal();
		}
		else {
			System.out.println("NUMERO INVALIDO!");
		}
		entrada.close();
	
	
	}

}
