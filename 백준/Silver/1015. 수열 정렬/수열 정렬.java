import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 값과 인덱스를 함께 저장
        Pair[] pairs = new Pair[N];
        for (int i = 0; i < N; i++) {
            pairs[i] = new Pair(A[i], i);
        }

        // 값 기준으로 정렬 (값이 같으면 인덱스 기준)
        Arrays.sort(pairs, (p1, p2) -> p1.value != p2.value ? Integer.compare(p1.value, p2.value) : Integer.compare(p1.index, p2.index));

        // 결과 P 배열 생성
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[pairs[i].index] = i;
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
    }

    // Pair 클래스 정의 (값과 인덱스)
    static class Pair {
        int value, index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}