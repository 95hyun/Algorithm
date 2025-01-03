import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        char inputChar = scanner.next().charAt(0);

        // 아스키 코드 값 계산
        int asciiValue = (int) inputChar;

        // 출력
        System.out.println(asciiValue);

        scanner.close();
    }
}