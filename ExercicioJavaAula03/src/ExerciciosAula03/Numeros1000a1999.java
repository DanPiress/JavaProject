package ExerciciosAula03;

public class Numeros1000a1999 {

	public static void main(String[] args) {
		
		for (int num = 1000; num <= 1999; num++) {
			if (num % 11 == 5) {
				System.out.println(num);
			}
		}

	}

}
