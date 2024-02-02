class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 칠해야 하는 섹션중에 첫부분부터 칠합니다.
        int startSection = section[0];
        answer++;

        // 나머지 섹션을 칠합니다.
        for (int i : section) {
            // 만약 칠해야하는 섹션 길이 + 롤러의 길이가 섹션위치보다 길면 이미 칠해져있으므로 다음 칠해야 하는 섹션으로 넘어갑니다.
            if (startSection + m > i) {
                continue;
            }
            
            // 칠하는 섹션을 새로 지정합니다.
            startSection = i;
            answer++;
        }
        
        return answer;
    }
}