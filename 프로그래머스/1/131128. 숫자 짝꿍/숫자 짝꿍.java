class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xCountArr = new int[10]; // X에 있는 각 숫자의 개수를 저장
        int[] yCountArr = new int[10]; // Y에 있는 각 숫자의 개수를 저장

        // X의 각 자릿수를 순회하며 해당 숫자의 개수를 카운트
        for (char x : X.toCharArray()) {
            xCountArr[x - '0']++;
        }
        // Y의 각 자릿수를 순회하며 해당 숫자의 개수를 카운트
        for (char y : Y.toCharArray()) {
            yCountArr[y - '0']++;
        }

        // 각 숫자에 대해 X와 Y에 공통으로 나타나는 횟수만큼 answer에 추가
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(xCountArr[i], yCountArr[i]); // 공통으로 나타나는 최소 횟수
            for (int j = 0; j < commonCount; j++) {
                answer.append(i);
            }
        }

        if (answer.length() == 0) {
            return "-1"; // 공통 숫자가 없는 경우
        } else if (answer.charAt(0) == '0') {
            return "0"; // 결과가 0으로만 구성된 경우
        }

        return answer.toString(); // 최종 짝꿍 반환
    }
}