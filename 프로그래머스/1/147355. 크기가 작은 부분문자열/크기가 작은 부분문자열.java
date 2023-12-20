class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);

        for (int i = 0; i <t.length()-p.length()+1; i++) {
            long cutNumber = Long.parseLong(t.substring(i, i + p.length()));
            if (cutNumber <= number) {
                answer++;
            }
        }

        return answer;
    }
}