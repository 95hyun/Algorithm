class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 1. 노란색 격자 수는 1 이상이므로 세로는 3 이상이다. 따라서, 반복문 i는 3부터 시작한다.
        // 2. brown+yellow의 약수를 구한다.
        // 입출력 예시 1을 보면 10+2 = 12의 약수이므로 (1,12), (2,6), (3,4)가 있다. 이때 i는 3부터 시작이므로 (3,4)의 경우를 확인한다.
        // 2-1) 가로는 12/i 이므로 4이다.
        // 2-2) yellow의 개수 = (가로 - 2) * (세로 - 2 )로 구할 수 있다.
        // 가로가 세로보다 길고 조건문 yellow=(가로 - 2) * (세로 - 2 )를 만족할 때 answer 결과를 반환한다.
        for(int i=3;i<brown+yellow;i++){
            int width = (brown+yellow)/i; 
            if(width>=i){
                 if ((i - 2) * (width - 2) == yellow) {
                answer[0] = width;
                answer[1] = i;
                break;
                }
            }
        }
        return answer;
    }
}