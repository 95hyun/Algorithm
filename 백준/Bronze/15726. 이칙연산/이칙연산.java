import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // 세 가지 경우 계산
        int result1 = (int) (A * (B / (double) C)); // A × (B / C)
        int result2 = (int) ((A / (double) B) * C); // (A / B) × C
        int result3 = (int) ((A * (double) B) / C); // (A × B) / C

        // 최대값 출력
        System.out.println(Math.max(result1, Math.max(result2, result3)));

        scanner.close();
    }
}