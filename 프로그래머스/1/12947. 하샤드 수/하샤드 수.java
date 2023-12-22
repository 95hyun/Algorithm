class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        String xStr = Integer.toString(x);
        for (int i = 0; i < xStr.length(); i++) {
            sum += Character.getNumericValue(xStr.charAt(i));
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}