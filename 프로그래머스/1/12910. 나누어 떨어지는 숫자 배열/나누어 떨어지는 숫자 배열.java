import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
     public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        int noDivide = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            } else {
                noDivide ++;
                if (noDivide == arr.length) {
                    answer.add(-1);
                    break;
                }
            }
        }
        Collections.sort(answer);


        return answer;
    }
}