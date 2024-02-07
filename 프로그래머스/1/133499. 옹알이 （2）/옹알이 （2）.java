class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // babbling을 돌면서 확인
        for (int i=0; i<babbling.length; i++){
            // 중복되는 발음은 제외
            babbling[i] = babbling[i].replace("ayaaya", "1");
            babbling[i] = babbling[i].replace("yeye", "1");
            babbling[i] = babbling[i].replace("woowoo", "1");
            babbling[i] = babbling[i].replace("mama", "1");
            
            // 발음 가능한 것들은 공백으로 바꾼후
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");

            // 공백들을 비워줌
            babbling[i] = babbling[i].replace(" ","");
            
            // i번째가 비어있다면 결론적으로 발음이 가능한것이므로 answer++
            if(babbling[i].isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}