import java.util.Scanner;

public class Main {
    enum Grade {
        A(90, 100), B(80, 89), C(70, 79), D(60, 69), F(0, 59);

        private final int lower;
        private final int upper;

        Grade(int lower, int upper) {
            this.lower = lower;
            this.upper = upper;
        }

        public static Grade of(int score) {
            for (Grade grade : values()) {
                if (score >= grade.lower && score <= grade.upper) {
                    return grade;
                }
            }
            throw new IllegalArgumentException("Invalid score: " + score);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        Grade grade = Grade.of(score);
        switch (grade) {
            case A:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case C:
                System.out.println("C");
                break;
            case D:
                System.out.println("D");
                break;
            case F:
                System.out.println("F");
                break;
        }
    }
}
