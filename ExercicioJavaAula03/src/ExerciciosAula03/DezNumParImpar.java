package ExerciciosAula03;

import java.util.Scanner;

public class DezNumParImpar {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner (System.in);
		
		int num, num2 = 0;
		
		for (num=1; num <= 10; num++) {
		
			System.out.println("\nEscreva o numero: ");
		num2 = ler.nextInt();
		
		if (num2 % 2 == 0) {
			System.out.println("O numero " + num2 + " é um numero par.");
			}
		
		else if(num2 % 2 == 1) {
			System.out.println("O numero " + num2 + " é um numero impar.");
			}
		}
		
		ler.close();	
		
		}
	}
