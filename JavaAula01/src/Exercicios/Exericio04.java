package Exercicios;

import java.util.Scanner;

public class Exericio04 {

	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite tres numeros: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		//numero inteiro ao quadrado
		r = (int) Math.pow(a + b, 2);
		s = (int) Math.pow(b + c, 2);
		
		d = (r + s) / 2; 
		
		System.out.println(d);
		
		entrada.close();
	
	}

}
