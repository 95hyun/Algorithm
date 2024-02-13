class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 상태를 저장할 배열 초기화 (모든 학생이 1벌씩 가지고 있다고 가정)
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = 1;
        }
        
        // 도난당한 학생 처리
        for (int l : lost) {
            students[l - 1]--;
        }
        
        // 여벌의 체육복을 가진 학생 처리
        for (int r : reserve) {
            students[r - 1]++;
        }
        
        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) { // 체육복이 없는 학생을 찾음
                if (i > 0 && students[i - 1] > 1) {
                    // 앞 번호 학생으로부터 체육복을 빌림
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] > 1) {
                    // 뒷 번호 학생으로부터 체육복을 빌림
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        // 체육수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int s : students) {
            if (s >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}