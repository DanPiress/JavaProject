package Exercicio03;

public class TesteProdutoEletronicos {

	public static void main(String[] args) {
		
		ProdutosEletronicos loja = new ProdutosEletronicos();
		
		loja.setCelular("Iphone XR Plus");
		loja.setNot("Asus Intel Core 17");
		loja.setTv("SmartTV Samsung 50'");
		
		
		System.out.println("O modelo do celular �: " + loja.getCelular());
		System.out.println("O modelo do notebook �: " + loja.getNot());
		System.out.println("O modelo da televis�o �: " + loja.getTv());
		
		
		
		
		
		
	}

}
