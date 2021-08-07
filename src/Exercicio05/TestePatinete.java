package Exercicio05;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		
		patinete1.setCor("Preto");
		patinete1.setPeso("70");
		patinete1.setRodas("3");
		patinete1.setTamanho("Ajustavel");
		
		System.out.println("O patinete é da cor: " + patinete1.getCor());
		System.out.println("O patinete pesa: " + patinete1.getPeso() + "kgs");
		System.out.println("O patinete contem: " + patinete1.getRodas() + " rodas");
		System.out.println("O tamanho do patinete é: " + patinete1.getTamanho());
		
	
	
	}

}
