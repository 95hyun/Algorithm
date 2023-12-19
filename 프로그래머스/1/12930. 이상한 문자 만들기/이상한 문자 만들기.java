class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ", -1);

        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < sArr[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += Character.toUpperCase(sArr[i].charAt(j));
                } else {
                    answer += Character.toLowerCase(sArr[i].charAt(j));
                }
            }
            if (i != sArr.length-1) {
                answer += " ";
            }
        }

        return answer;
    }
}