import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        System.out.println(factorial(N));
    }
    
    public static int factorial(int N) {
        if (N <= 1) return 1;
        else return N * factorial(N-1);
    }
}
