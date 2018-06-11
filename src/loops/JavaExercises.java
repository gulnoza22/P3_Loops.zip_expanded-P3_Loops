package loops;

public class JavaExercises {
	public static void main(String[] args) {
		printStars();
	}

	static void printStars() {

		for (int i = 0; i <= 6; i++) {
			
			for (int j = 1; j <= 1+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}