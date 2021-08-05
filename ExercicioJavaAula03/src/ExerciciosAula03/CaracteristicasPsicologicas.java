package ExerciciosAula03;

import java.util.Scanner;

public class CaracteristicasPsicologicas {
	
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
		int idade, sexo, nervos, pessoa = 1;
		int pc = 0, mn = 0, ha = 0, oc = 0, pn = 0, pc18 = 0;
		
		while (pessoa <= 3) {
		
				System.out.println("Digite a idade da pessoa de numero " + pessoa + ": ");
					idade = ler.nextInt();
					while (idade < 0 || idade > 130) {
						System.out.println("Voce provavelmente entrou com a idade incorreta");
						System.out.println("Digite a idade novamente: ");
						idade = ler.nextInt();
					}
				
				System.out.println("Qual sexo da pessoa " + pessoa + "? ");
				System.out.println("Digite '1' para Feminino" + "\nDigite '2' para Masculino" + "\nDigite '3' para Outros");
					sexo = ler.nextInt();
					while (sexo < 1 || sexo > 3) {
						System.out.println("Voce provavelmente entrou com o codigo incorreto");
						System.out.println("Digite o codigo novamente novamente: ");
						sexo = ler.nextInt();
					}
				
				System.out.println("Escolha a opção que define o estado nervoso da pessoa " + pessoa + ": ");
				System.out.println("Digite '1' para Calmo(a)" + "\nDigite '2' para Nervoso(a)" + "\nDigite '3' para Agressivo(a)");
					nervos = ler.nextInt();
					while (nervos < 1 || nervos > 3) {
						System.out.println("Voce provavelmente entrou com o codigo incorreto");
						System.out.println("Digite o codigo novamente novamente: ");
						nervos = ler.nextInt();
					}
				pessoa ++;
				
				if (nervos == 1) {
					pc = pc + 1;
				}
				if(sexo == 1 && nervos == 2) {
					mn = mn + 1;
				}
				if(sexo == 2 && nervos == 3) {
					ha = ha + 1;
				}
				if(sexo == 3 && nervos == 1) {
					oc = oc + 1;
				}
				if (idade > 40 && nervos == 2) {
					pn = pn + 1;
				}
				if (idade < 18 && nervos == 1) {
					pc18 = pc18 + 1;
				}
			}	
		System.out.println("\nO numero de pessoas calmas é: " + pc);
		System.out.println("\nO numero de muleres nervosas é: " + mn);
		System.out.println("\nO numero de homens agressivos é: " + ha);
		System.out.println("\nO numero de pessoas nervosas com mais de 40 é: " + pn);
		System.out.println("\nO numero de pessoas calmas com mais de 18 é: " + pc18);
		ler.close();
	}
	
}
