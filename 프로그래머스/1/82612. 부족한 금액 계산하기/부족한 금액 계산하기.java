class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        int check = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
            check ++;
        }
        if (check == count) {
            if (money < sum) {
                answer = sum - money;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
    
}