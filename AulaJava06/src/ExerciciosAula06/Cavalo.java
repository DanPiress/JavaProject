package ExerciciosAula06;

public class Cavalo extends Animal {
	
	private String movimento = "Correr";
	
	public void setMovimento (String movimento) {
		this.movimento = movimento;
		}
	public String getMovimento () {
		return movimento;
	}
	public void som() {
		System.out.println("E E E");
	}
	
}
