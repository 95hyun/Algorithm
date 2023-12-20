import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String nStr = Long.toString(n);
        char[] arr = nStr.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }

        sb.reverse();

        answer = Long.parseLong(String.valueOf(sb));

        return answer;
    }
}