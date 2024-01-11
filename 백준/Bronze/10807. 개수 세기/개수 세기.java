import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정수의 개수 N 입력
        int[] numbers = new int[N];

        // 정수들 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int v = scanner.nextInt(); // 찾으려는 정수 v 입력

        int count = 0; // 개수를 세기 위한 변수 초기화

        // 입력된 정수들을 탐색하며 v의 개수를 세기
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }

        System.out.println(count); // v의 개수 출력
    }
}
