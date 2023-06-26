package basico;

public class repetition {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int fatorial = 1;
			
			for (int j = 1; j <= i; j++) {		
				fatorial *= j;
			}
			
			System.out.println(i + "! = " + fatorial);
		}
	}
}