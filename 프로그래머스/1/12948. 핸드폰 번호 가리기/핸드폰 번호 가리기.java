class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String replaceNum = "";
        String firstNum = "";
        String lastNum = "";

        for (int i = 0; i < phone_number.length() -4; i++) {
            replaceNum += phone_number.charAt(i);
            firstNum += '*';
        }
        lastNum = phone_number.replace(replaceNum, "");
        answer = firstNum + lastNum;
        return answer;
    }
}