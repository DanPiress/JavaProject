package ExerciciosAula06;

public class Cachorro extends Animal {

	private String movimento;
	
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
		public String getMovimento() {
			return movimento;
		}
	public void latir() {
		System.out.print ("AU AU");
	}

}
