import javax.swing.plaf.metal.MetalBorders;
import java.util.Scanner;

public class Main {

    public static JoKenPo startGame() {
        System.out.println("******* ✊✋✌ JO-KEN-PO ✊✋✌ *******\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("INFORME SEU NOME: ");
        String playerName = scan.next().toUpperCase() + (" \uD83D\uDE0E");

        Player user = new Player(playerName);
        Player IA = new Player("IA \uD83D\uDC7D");

        System.out.println(playerName + " INFORME QUANTOS ROUNDS VOCÊ QUER JOGAR: ");
        int rounds = scan.nextInt();

        return new JoKenPo(user, IA, rounds);
    }

    public static void main(String[] args) {
        JoKenPo jokenpo = startGame();
        jokenpo.toPlay();
        jokenpo.showFinalResults();
    }
}