package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
	double seg, min, hora;
	
	System.out.println("Digite o tempo do evento em segundos: ");
	seg = entrada.nextDouble();
	
	min = seg / 60;
	hora = min / 60;
	
	System.out.println("Segundos: " + seg);
	System.out.println("Minutos: " + min);
	System.out.println("Hora: " + hora);
		
		entrada.close();
	

	}

}
