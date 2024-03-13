import java.util.Scanner;

public class Player {
	int number = 0;
	String name;

	public void guess() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "! Escolha um número: ");
		number = sc.nextInt();
		System.out.println(name+ " escolheu o " + number);

	}

}
