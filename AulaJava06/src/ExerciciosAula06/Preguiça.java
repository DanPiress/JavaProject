package ExerciciosAula06;

public class Pregui�a extends Animal{
	
	private String movimento;
	
	public void setMovimento (String movimento) {
		this.movimento = movimento;
		}
	public String getMovimento () {
		return movimento;
	}
	public void som(){
		System.out.println("IH IH IH");
	}
	
}
