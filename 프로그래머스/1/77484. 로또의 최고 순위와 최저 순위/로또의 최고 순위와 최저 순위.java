class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 0은 최고순위, 1은 최저순위
        int answer[] = new int[2];
        // 맞출수록 등수가 올라가는 rank 배열
        int rank[] = {6,6,5,4,3,2,1};
        
        int zero = 0; // lotto 번호가 0일때 카운트
        int count = 0; // win_nums와 lottos의 번호가 일치할때 카운트
        
        // 로또번호 중에 0이 있으면 zero++
        for(int i : lottos){
            if(i == 0){
                zero++;
            }
            
        }
        
        // 로또번호와 win_num을 대조하여 맞으면 count++
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < lottos.length; j++){
                if(lottos[i] == win_nums[j]){ 
                    count++;}
                
            }
        }

        // 최고순위, 최저순위
        answer[0] = rank[count + zero];
        answer[1] = rank[count];

        return answer;
    }
}