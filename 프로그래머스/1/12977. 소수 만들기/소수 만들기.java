import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // sum list
        ArrayList<Integer> sumList = new ArrayList<Integer>();

        // 3개의 수를 더해서 나올 수 있는 합들을 계산하여 sumList에 추가
        for (int i = 0; i < nums.length; i++) {
            if(i + 2 >= nums.length){
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sumList.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        // sumList에 들어있는 3자리수 합이 소수인지 판별
        for (Integer i : sumList) {
            // 기본으로 answer++ 를 시켜놓고
            answer++;
            // 소수가 아니면 다시 answer-- 하고 다음 3자리 수 합 판별로 넘어감
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}