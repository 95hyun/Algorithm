class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[0] -= - 1;
            }
            if (food[i] >= 2) {
                for (int j = 0; j < food[i]/2; j++) {
                    sb.append(i);
                }
            }
        }
        String answer = sb + "0";
        answer += sb.reverse();;

        return answer;
    }
}