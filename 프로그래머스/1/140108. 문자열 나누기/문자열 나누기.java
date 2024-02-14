class Solution {
    public int solution(String s) {
        int count = 0; // 분해된 문자열의 개수를 세기 위한 변수
        while (s.length() > 0) { // 남은 문자열이 있는 동안 반복
            char x = s.charAt(0); // 현재 문자열의 첫 글자
            int xCount = 0; // x 문자의 개수
            int notXCount = 0; // x가 아닌 문자의 개수
            
            int i;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    notXCount++;
                }
                
                if (xCount == notXCount) {
                    break;
                }
            }
            
            count++; // 분리된 문자열의 개수를 증가
            // 남은 문자열 업데이트 시 유효성 검사 추가
            if (i + 1 < s.length()) {
                s = s.substring(i + 1);
            } else {
                break; // 더 이상 분리할 수 없으면 반복 종료
            }
        }
        
        return count; // 분해된 문자열의 개수 반환
    }
}