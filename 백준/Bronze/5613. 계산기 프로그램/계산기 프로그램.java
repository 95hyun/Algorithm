import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자를 입력받아 초기 결과로 설정
        int result = scanner.nextInt();

        while (true) {
            // 연산자 입력
            String operator = scanner.next();

            // '='가 입력되면 결과 출력 후 종료
            if (operator.equals("=")) {
                System.out.println(result);
                break;
            }

            // 다음 숫자 입력
            int operand = scanner.nextInt();

            // 연산 수행
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            } else if (operator.equals("*")) {
                result *= operand;
            } else if (operator.equals("/")) {
                result /= operand; // 정수 나눗셈
            }
        }

        scanner.close();
    }
}