class Solution {
    public String solution(int a, int b) {
        String answer = "";

        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sumDay = 0;

        for (int i = 0; i < a - 1; i++) {
            sumDay += monthDay[i];
        }

        sumDay += b - 1;

        answer = week[sumDay % 7];

        return answer;
    }
}