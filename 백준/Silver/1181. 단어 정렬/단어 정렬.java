import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        // 중복 제거를 위해 Set 사용
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            wordSet.add(scanner.nextLine());
        }

        // Set을 List로 변환 후 정렬
        List<String> wordList = new ArrayList<>(wordSet);
        wordList.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });

        // 결과 출력
        for (String word : wordList) {
            System.out.println(word);
        }

        scanner.close();
    }
}