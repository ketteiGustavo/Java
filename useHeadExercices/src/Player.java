import java.util.Scanner;

public class Player {
	int number = 0;

	public void guess() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um número: ");
		number = sc.nextInt();
		System.out.println("Meu número é o " + number);

	}

}
