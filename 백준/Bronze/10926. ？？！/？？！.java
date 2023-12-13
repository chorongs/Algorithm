import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userId = scanner.nextLine();

        while (!isValidId(userId)) {
            userId = scanner.nextLine();
        }

        System.out.println(userId + "??!");
    }

    private static boolean isValidId(String id) {
        return id.matches("^[a-z]{1,50}$");
    }
}
