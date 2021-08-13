package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int dia, mes, ano, total;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		ano = entrada.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		mes = entrada.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dia = entrada.nextInt();
		
		total = dia + (ano * 360);
		
		total = total + (mes * 30);
		
		System.out.println(total);
	
		entrada.close();
	}

}
