import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int X = scanner.nextInt();

        // 대각선 번호 계산
        int n = 1;
        while (X > n * (n + 1) / 2) {
            n++;
        }

        // 대각선 시작 번호
        int start = n * (n - 1) / 2 + 1;

        // 대각선에서의 위치
        int position = X - start;

        // 분수 계산
        int numerator, denominator;
        if (n % 2 == 1) { // 홀수 대각선
            numerator = n - position;
            denominator = 1 + position;
        } else { // 짝수 대각선
            numerator = 1 + position;
            denominator = n - position;
        }

        // 결과 출력
        System.out.println(numerator + "/" + denominator);

        scanner.close();
    }
}