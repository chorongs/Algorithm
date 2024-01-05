import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<n; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            sum += price * quantity;
        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
