public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
public void startGame() {

    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    int targetNumber = (int) (Math.random() * 10);
    

    while (true){
    	System.out.println("Foi sorteado um número entre 0 e 9...");
        System.err.println("O número sorteado foi??? ");

        p1.guess();
        p2.guess();
        p3.guess();
        
        
        guessp1 = p1.number;
        System.out.println(p1.name + " forneceu o palpite "+ guessp1);

        guessp2 = p2.number;
        System.out.println(p2.name + " forneceu o palpite "+ guessp2);

        guessp3 = p3.number;
        System.out.println(p3.name + " forneceu o palpite "+ guessp3);
    
        if (guessp1 == targetNumber){
            p1isRight = true;
        }
        if (guessp2 == targetNumber){
            p2isRight = true;
        }
        if (guessp3 == targetNumber){
            p3isRight = true;
        }

        if (p1isRight || p2isRight || p3isRight) {
            System.out.println("Temos um vencedor!");
            
            if (p1.number == targetNumber) {
            	System.out.println(p1.name + " acertou!");
            }
            if (p2.number == targetNumber) {
            	System.out.println(p2.name + " acertou!");
            }
            if (p3.number == targetNumber) {
            	System.out.println(p3.name + " acertou!");
            }
            System.out.println("O número sorteado foi " + targetNumber);
            System.out.println("Fim do jogo.");

            break; // fim do jogo, portanto saia do loop
        }else{
            // devemos continuar porque ninguem acertou!
        	System.out.println("O número a advinhar era o... " + targetNumber);
            System.out.println("Ninguém acertou! Os jogadores terão que tentar novamente...");
        }
        }
    }

}