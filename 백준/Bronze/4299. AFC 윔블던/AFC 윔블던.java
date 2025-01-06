import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int S = scanner.nextInt(); // 점수의 합
        int D = scanner.nextInt(); // 점수의 차

        // A와 B 계산
        if ((S + D) % 2 != 0 || (S - D) % 2 != 0) {
            // 합 또는 차가 짝수가 아니면 결과가 나올 수 없음
            System.out.println(-1);
        } else {
            int A = (S + D) / 2; // 높은 점수
            int B = (S - D) / 2; // 낮은 점수

            // A와 B가 음수가 아니어야 하고 A >= B 조건 확인
            if (A >= 0 && B >= 0 && A >= B) {
                System.out.println(A + " " + B);
            } else {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}