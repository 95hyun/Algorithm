import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수
        int T = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            // 조합 계산
            result.append(combination(M, N)).append("\n");
        }

        System.out.print(result);
        scanner.close();
    }

    // 조합 계산 함수
    public static long combination(int M, int N) {
        if (N == 0 || M == N) {
            return 1;
        }

        // 최적화된 조합 계산
        long result = 1;
        for (int i = 0; i < N; i++) {
            result *= (M - i);
            result /= (i + 1);
        }
        return result;
    }
}