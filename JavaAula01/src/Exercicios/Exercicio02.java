package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
	int dia, mes, ano;	
	
	System.out.println("Digite a sua idade em dias: ");
	dia = entrada.nextInt();
	
	mes = dia / 30;
	ano = dia / 360;
	
	System.out.println("Sua idade em dias �: " + dia);
	System.out.println("Sua idade em meses �: " + mes);
	System.out.println("Sua idade em anos �: " + ano);
	
	entrada.close();
	
	}

}
