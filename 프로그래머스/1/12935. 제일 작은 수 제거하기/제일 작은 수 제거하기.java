import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer1 = new int[arr.length];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                answer1[0] = -1;
                break;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (arr.length != 1) {
            List<Integer> integerArrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    integerArrayList.add(arr[i]);
                }

            }
            int[] answer2 = new int[integerArrayList.size()];
            for (int i = 0; i < answer2.length; i++) {
                answer2[i] = integerArrayList.get(i);
                
            }
            return answer2;
        }
        return answer1;
    }
}