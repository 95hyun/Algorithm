class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder(); // StringBuilder를 사용하여 문자열 연결 성능 향상

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c++; // 다음 알파벳으로 이동
                if (c > 'z') {
                    c = (char)('a' + (c - 'z' - 1)); // 알파벳이 z를 넘어가면 a로 돌아감
                }
                if (skip.contains(String.valueOf(c))) {
                    j--; // skip 문자는 이동 횟수에서 제외
                }
            }
            answer.append(c); // 변환된 문자를 결과 문자열에 추가
        }

        return answer.toString(); // StringBuilder 객체를 문자열로 변환하여 반환
    }
}