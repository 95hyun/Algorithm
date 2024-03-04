class Solution {
    public int solution(int n) {
        int answer[] = new int[n + 1];

        // 피보나치 수열이란?
        // 이전 두 항의 합이 다음 항이 되는 수열을 의미.
        // 즉, 첫째 항과 둘째 항이 1이고 모든 항은 바로 앞 두항의 합으로 이루어지는 수열을 의미

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                answer[i] = 0;
            } else if (i == 1) {
                answer[i] = 1;
            } else {
                int sum = answer[i - 2] + answer[i - 1];
                answer[i] = sum % 1234567;
            }
        }

        return answer[n];
    }
}