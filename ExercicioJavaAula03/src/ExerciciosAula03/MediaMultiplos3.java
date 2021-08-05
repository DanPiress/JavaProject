package ExerciciosAula03;

import java.util.Scanner;

public class MediaMultiplos3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
int num = 0, num2 = 0, num3 = -1;
		
		do {
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
			
			
			if(num % 3 == 0) {
				num3++;
				num2 = num2 + num;
				 
			}
		}
		while (num != 0);
		num3 = num2 / num3;

		System.out.println("A media é: " + num3 );
	}
}
