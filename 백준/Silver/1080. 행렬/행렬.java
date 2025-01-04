import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        // 행렬 A와 B 입력
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                A[i][j] = line.charAt(j) - '0';
            }
        }
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                B[i][j] = line.charAt(j) - '0';
            }
        }

        // 변환 연산 수행
        int result = transformMatrix(A, B, N, M);
        System.out.println(result);

        scanner.close();
    }

    // 행렬 변환 함수
    public static int transformMatrix(int[][] A, int[][] B, int N, int M) {
        int count = 0;

        // 3x3 연산 적용
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= M - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    flip3x3(A, i, j);
                    count++;
                }
            }
        }

        // 변환이 완료된 후 확인
        if (isEqual(A, B, N, M)) {
            return count;
        } else {
            return -1;
        }
    }

    // 3x3 영역 뒤집기 함수
    public static void flip3x3(int[][] A, int x, int y) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[x + i][y + j] ^= 1; // 0 -> 1, 1 -> 0
            }
        }
    }

    // 두 행렬이 같은지 확인
    public static boolean isEqual(int[][] A, int[][] B, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
