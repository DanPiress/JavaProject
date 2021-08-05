package ExerciciosAula03;

import java.util.Scanner;

public class SomaNumerosDigitados {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int num = 0, num2 = 0;
		
		do {
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		if (num != 0) {
			num2 = num2 + num;
			}
		}
		while (num != 0);
		
		System.out.println("A soma dos numeros é: " + num2 );
			ler.close();
	}

}
