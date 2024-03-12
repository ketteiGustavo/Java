import java.util.Scanner;

public class GuessGame {
	Player[] players;

	public void startGame() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos jogadores irão jogar? ");

		int numPlayers = sc.nextInt();
		sc.nextLine();

		players = new Player[numPlayers];

		for (int i = 0; i < numPlayers; i++) {
			players[i] = new Player();
			System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
			players[i].name = sc.nextLine();
		}

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Foi sorteado um número entre 0 e 9...");
		System.err.println("Quem adivinhará o número???");

		while (true) {
			
			boolean acertou = false;

			System.err.println("O número sorteado foi??? " + targetNumber);

			for (Player player : players) {
				player.guess();

				if (player.number == targetNumber) {
					acertou = true;
					System.out.println("O número sorteado foi " + targetNumber);
					System.out.println("Temos um vencedor! Parabéns, " + player.name + "!Acertou o número sorteado!");
					System.out.println("Fim do jogo.");
					return; // fim do jogo, portanto saia do loop
				}
			}
			
			if(!acertou) {
				System.out.println("Ninguém acertou! Os jogadores terão que tentar novamente...");
			}

		}
	}

}