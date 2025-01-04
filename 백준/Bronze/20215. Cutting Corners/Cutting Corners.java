import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        // 대각선 길이 계산
        double diagonal = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

        // 직사각형 절단 길이
        double rectangleCut = w + h;

        // 차이 계산
        double difference = rectangleCut - diagonal;

        // 결과 출력
        System.out.printf("%.6f%n", difference);

        scanner.close();
    }
}