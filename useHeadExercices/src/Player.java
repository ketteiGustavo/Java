import java.util.Scanner;

public class Player {
	int number = 0;
	String name;

	public void guess() {
		
		Player[] p = new Player[3];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		name = sc.nextLine();
		System.out.println("Olá " + name + "! Escolha um número: ");
		number = sc.nextInt();
		System.out.println(name+ " escolheu o " + number);

	}

}
