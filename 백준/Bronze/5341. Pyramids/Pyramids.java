import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            // 입력이 0이면 종료
            if (n == 0) {
                break;
            }

            // 블록 총 개수 계산
            int totalBlocks = (n * (n + 1)) / 2;

            // 출력
            System.out.println(totalBlocks);
        }

        scanner.close();
    }
}