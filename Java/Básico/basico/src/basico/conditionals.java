package basico;

public class conditionals {
	public static void main(String[] args) {
		int idade = 18;
		boolean acompanhado = false;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Você pode entrar na festa!");
		} else {
			System.out.println("Você não pode entrar na festa!");
		}
	}
}