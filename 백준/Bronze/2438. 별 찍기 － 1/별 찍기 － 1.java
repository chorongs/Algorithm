import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사용자로부터 숫자 N을 입력받음
        for (int i = 1; i <= N; i++) { // 1부터 N까지 반복
            for (int j = 0; j < i; j++) { // i번만큼 별을 찍기 위한 반복
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 한 줄에 별을 찍고 줄바꿈
        }

        sc.close(); // Scanner 객체 닫기
    }
}
