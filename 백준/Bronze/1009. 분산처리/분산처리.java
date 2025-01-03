import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int t = scanner.nextInt();
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // a의 마지막 자리 숫자
            int lastDigit = a % 10;

            // 마지막 자리 숫자에 따른 주기 계산
            int result;
            switch (lastDigit) {
                case 0: 
                    result = 10; 
                    break; // 0의 거듭제곱은 항상 10번 컴퓨터
                case 1: 
                    result = 1; 
                    break;  // 1의 거듭제곱은 항상 1번 컴퓨터
                case 2: 
                    result = new int[]{2, 4, 8, 6}[(b - 1) % 4]; 
                    break;
                case 3: 
                    result = new int[]{3, 9, 7, 1}[(b - 1) % 4]; 
                    break;
                case 4: 
                    result = new int[]{4, 6}[(b - 1) % 2]; 
                    break;
                case 5: 
                    result = 5; 
                    break;  // 5의 거듭제곱은 항상 5번 컴퓨터
                case 6: 
                    result = 6; 
                    break;  // 6의 거듭제곱은 항상 6번 컴퓨터
                case 7: 
                    result = new int[]{7, 9, 3, 1}[(b - 1) % 4]; 
                    break;
                case 8: 
                    result = new int[]{8, 4, 2, 6}[(b - 1) % 4]; 
                    break;
                case 9: 
                    result = new int[]{9, 1}[(b - 1) % 2]; 
                    break;
                default: 
                    result = 10;
            }

            // 결과 저장
            results[i] = result;
        }

        // 결과 출력
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
