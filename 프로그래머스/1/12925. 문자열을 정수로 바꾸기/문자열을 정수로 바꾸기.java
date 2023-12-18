class Solution {
    public int solution(String s) {
        int answer = 0;

        if (s.charAt(0) == '+') {
            String s1= s.replace("+", "");
            String s2 = s1.replaceAll("\\s", "");
            answer = Integer.parseInt(s2);
        } else if (s.charAt(0) == '-') {
            String s1= s.replace("-", "");
            String s2 = s1.replaceAll("\\s", "");
            answer = -(Integer.parseInt(s2));
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}