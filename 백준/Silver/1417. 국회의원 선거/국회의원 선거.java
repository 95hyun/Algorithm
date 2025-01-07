import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int dasom = scanner.nextInt();
        List<Integer> others = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            others.add(scanner.nextInt());
        }

        int bribes = 0;

        // 다솜이가 가장 많은 표를 가질 때까지 반복
        while (!others.isEmpty()) {
            // 가장 많은 표를 가진 후보 찾기
            Collections.sort(others, Collections.reverseOrder());
            if (others.get(0) < dasom) {
                break;
            }

            // 표 조작
            others.set(0, others.get(0) - 1);
            dasom++;
            bribes++;
        }

        // 결과 출력
        System.out.println(bribes);
    }
}