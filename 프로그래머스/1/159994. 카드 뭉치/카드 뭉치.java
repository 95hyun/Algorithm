class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cards1Index = 0; // 카드뭉치1 인덱스
        int cards2Index = 0; // 카드뭉치2 인덱스

        for (int i = 0; i < goal.length; i++) {
            String currentWord = goal[i]; // goal 배열 안의 단어를 i++ 로 조회
            
            if (cards1Index < cards1.length && currentWord.equals(cards1[cards1Index])) {
                cards1Index++;
            } else if (cards2Index < cards2.length && currentWord.equals(cards2[cards2Index])) {
                cards2Index++;
            } else {
                answer = "No";
                return answer;
            }
        }
        answer = "Yes";
        return answer;
    }
}