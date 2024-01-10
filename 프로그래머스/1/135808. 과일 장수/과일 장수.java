import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // score 배열에서 상자에 m만큼 담아 상자에 담긴 사과의 점수중 최하점을 기준으로 m만큼 곱해서 가격이 책정되기 때문에
        // score 배열을 오름차순으로 정렬 시켜 최하점의 사과들부터 index 0 부터 위치하게 바꿔준다.
        // 그리고 m만큼 담아야 하기때문에 만들 수 있는 상자의 수는 score.length / m 와 같다.

        int answer = 0;
        int box = score.length / m;

        Arrays.sort(score);

        for (int i = 0; i < box; i++) {
            if (score.length % m != 0) {
                answer += score[score.length % m + (i * m)] * m;
            } else {
                answer += score[i * m] * m;
            }
        }

        return answer;
    }
}