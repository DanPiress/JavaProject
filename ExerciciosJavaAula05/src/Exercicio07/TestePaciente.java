package Exercicio07;

public class TestePaciente {

	public static void main(String[] args) {
	
		Paciente paciente1 = new Paciente();
	paciente1.setDoenca("Pneumonia");
	paciente1.setIdade("34");
	paciente1.setNome("Joao Paulo");
	paciente1.setPeso("95");

	System.out.println("O paciente " + paciente1.getNome());
	System.out.println("Tem " + paciente1.getIdade() + " anos");
	System.out.println("Tem " + paciente1.getPeso() + "kgs");
	System.out.println("Esta com " + paciente1.getDoenca());
	
	
	}

}
