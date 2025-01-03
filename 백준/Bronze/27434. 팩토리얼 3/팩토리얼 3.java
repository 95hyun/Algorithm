import java.math.BigInteger;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기
        int N = Integer.parseInt(reader.readLine());

        // 팩토리얼 계산
        if (N == 0 || N == 1) {
            System.out.println(1);
        } else {
            System.out.println(divideAndConquerFactorial(1, N));
        }

        reader.close();
    }

    // 분할정복 방식으로 팩토리얼 계산
    public static BigInteger divideAndConquerFactorial(int start, int end) {
        if (start > end) {
            return BigInteger.ONE;
        }
        if (start == end) {
            return BigInteger.valueOf(start);
        }

        // 중간 지점 계산
        int mid = (start + end) / 2;

        // 왼쪽과 오른쪽을 재귀적으로 계산하고 병합
        BigInteger left = divideAndConquerFactorial(start, mid);
        BigInteger right = divideAndConquerFactorial(mid + 1, end);

        return left.multiply(right);
    }
}