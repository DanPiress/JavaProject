package br.com.generetion.exercicioColection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		int i, atualizar, remover;
		String dado, adicionar;
		String produto1 = "AirForce";
		String produto2 = "AirMax";
		String produto3 = "Jordan";
		
		Scanner ler = new Scanner(System.in);
		ArrayList <String> produtos = new ArrayList<>(); 
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		System.out.println("Escolha uma opção");
		System.out.println("1 - Armazenar produto");
		System.out.println("2 - Atualizar produto");
		System.out.println("3 - Remover produto");
		System.out.println("4 - Exibir produto");
		i = ler.nextInt();
		
		if (i == 1) {
		System.out.println("Escreva o produto que deseja armazenar");	
		dado = ler.next();
		
		produtos.add(dado);
		
		System.out.println("O produto " + dado + " foi armazenado com sucesso");
		Collections.sort(produtos);
		System.out.println(produtos);
		}
		else if (i == 2) {
			System.out.println("Digite o numero do produto que deseja atualizar: ");
			System.out.println("Produto 1: " + produto1);
			System.out.println("Produto 2: " + produto2);
			System.out.println("Produto 3: " + produto3);
			atualizar = ler.nextInt();
			if (atualizar == 1) {
			
				System.out.println("Escreva o produto que deseja adicionar: ");
				adicionar = ler.next();
				produtos.remove(0);
				produtos.add(adicionar);
				Collections.sort(produtos);
				System.out.println(produtos);
			}
		
			else if (atualizar == 2) {
			
				System.out.println("Escreva o produto que deseja adicionar: ");
				adicionar = ler.next();
				produtos.remove(1);
				produtos.add(adicionar);
				Collections.sort(produtos);
				System.out.println(produtos);
			}
			
			else if (atualizar == 3) {
				System.out.println("Escreva o produto que deseja adicionar: ");
				adicionar = ler.next();
				produtos.remove(2);
				produtos.add(adicionar);
				Collections.sort(produtos);
				System.out.println(produtos);
			}
			
		}
		
		else if (i == 3) {
			System.out.println("Digite o numero do produto que deseja remover: ");
			System.out.println("Produto 1: " + produto1);
			System.out.println("Produto 2: " + produto2);
			System.out.println("Produto 3: " + produto3);
			remover = ler.nextInt();
			
			if (remover == 1) {
				produtos.remove(0);
				System.out.println(produtos);
			}
			else if (remover == 2) {
				produtos.remove(1);
				System.out.println(produtos);
			}	
			else if (remover == 3) {
				produtos.remove(2);
				System.out.println(produtos);
			}	
		}
		else if (i == 4) {
			System.out.println(produto1);
			System.out.println(produto2);
			System.out.println(produto3);
		}
		
		ler.close();
	}
}
