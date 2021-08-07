package Exercicio02;

public abstract class TestAeronave {

	public static void main(String[] args) {
		
		Aeronave aviao1 = new Aeronave();
		
		aviao1.setModelo("Boeing 777");	
		aviao1.setPassageiros("A aeronave suporta de 301 a 368 passageiros");
		aviao1.setFabricante("O fabricante da aeronave é LATAM");
		aviao1.setPortas("A aeronave possui 10 portas de saida");
		aviao1.setPoltronas("A aeronave possui até 381 poltronas");
		
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getFabricante());
		System.out.println(aviao1.getPoltronas());
		System.out.println(aviao1.getPassageiros());
		System.out.println(aviao1.getPortas());
		
		}

	}

