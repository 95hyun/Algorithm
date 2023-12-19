class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        for (int i = 0, j = sb.length()-1; i < sb.length(); i++, j--) {
            answer += (int) ((sb.charAt(i)-'0') * Math.pow(3, j));
        }

        return answer;
    }
}