import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 수
        int T = scanner.nextInt();

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long distance = y - x;

            // 최소 이동 횟수 계산
            long move = 0; // 현재 이동 거리
            long count = 0; // 이동 횟수

            while (distance > 0) {
                move++;
                distance -= move;
                count++;
                if (distance > 0) {
                    distance -= move;
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}