import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        int prize;

        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice1 == dice3) {
            prize = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            prize = 1000 + dice2 * 100;
        } else {
            prize = Math.max(Math.max(dice1, dice2), dice3) * 100;
        }

        System.out.println(prize);
    }
}
