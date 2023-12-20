class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String cutNum = t.substring(i, p.length()+i);
            if (Long.parseLong(cutNum) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}