import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 도메인의 유명도 입력 받기
        long N = sc.nextLong();
        long M = sc.nextLong();

        // 유명도 차이 계산
        long difference = Math.abs(N - M);

        // 유명도 차이 출력
        System.out.println(difference);
    }
}
