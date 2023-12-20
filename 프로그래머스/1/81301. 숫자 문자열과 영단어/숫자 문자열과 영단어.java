class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] strNumber = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strNumber.length; i++) {
            if (s.contains(strNumber[i])) {
                s = s.replaceAll(strNumber[i], Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}