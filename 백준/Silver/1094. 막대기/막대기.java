import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int X = scanner.nextInt();
        int count = 0;

        // 이진수에서 1의 개수를 센다
        while (X > 0) {
            count += X & 1; // 마지막 비트가 1인지 확인
            X >>= 1; // 오른쪽으로 한 비트 이동
        }

        // 출력
        System.out.println(count);
        scanner.close();
    }
}