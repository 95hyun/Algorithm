class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sArr[i] = String.valueOf(s.charAt(i));
        }
        if (s.length() % 2 == 0) {
            answer = sArr[s.length()/2 - 1] + sArr[s.length()/2];
        } else {
            answer = sArr[s.length()/2];
        }
        return answer;
    }
}