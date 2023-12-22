import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = 0;


        String answerStr = Integer.toString(n);

        for (int i = 0; i < answerStr.length(); i++) {
            answer += Character.getNumericValue(answerStr.charAt(i));
        }


        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}