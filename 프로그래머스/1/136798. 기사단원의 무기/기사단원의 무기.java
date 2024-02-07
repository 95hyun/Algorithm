class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            // i의 제곱근까지만 확인
            int sqrt = (int) Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    // 나누어 떨어지면, j와 i/j는 약수
                    count += (i / j == j) ? 1 : 2; // i가 j*j와 같다면 약수가 하나만 추가됨
                }
            }
            // 약수의 개수가 limit을 초과하면 power로 설정
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
}