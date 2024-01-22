import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        // 각 수포자들 찍기 스타일
        int[] supoman1 = {1,2,3,4,5};
        int[] supoman2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoman3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0,0,0};

        // 점수 계산
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == supoman1[i%5]) score[0]++;
            if(answers[i] == supoman2[i%8]) score[1]++;
            if(answers[i] == supoman3[i%10]) score[2]++;
        }

        // 최대 점수
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 최대 점수 수포자 리스트
        List<Integer> scoreed = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if(max == score[i]) scoreed.add(i+1);

        int[] answer = new int[scoreed.size()];
        for(int i=0; i<scoreed.size(); i++){
            answer[i] = scoreed.get(i);
        }

        return answer;
    }
}