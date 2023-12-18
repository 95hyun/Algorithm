class Solution {
    public long[] solution(long n) {

        String nStr = String.valueOf(n);
        long[] answer = new long[nStr.length()];

        for (int i = 0, j = nStr.length() - 1; i < nStr.length(); i++, j--) {
            answer[j] = Character.getNumericValue(nStr.charAt(i));
        }

        return answer;
    }
}