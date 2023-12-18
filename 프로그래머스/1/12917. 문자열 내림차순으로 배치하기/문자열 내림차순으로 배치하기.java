import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer;
        String upper = "";

        String lower = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                lower += s.charAt(i);
            } else if (Character.isUpperCase(s.charAt(i))) {
                upper += s.charAt(i);
            }
        }

        String arrLower[] = new String[lower.length()];
        String arrUpper[] = new String[upper.length()];

        for (int i = 0; i < arrLower.length; i++) {
            arrLower[i] = String.valueOf(lower.charAt(i));
        }
        for (int i = 0; i < arrUpper.length; i++) {
            arrUpper[i] = String.valueOf(upper.charAt(i));
        }

        Arrays.sort(arrLower, Collections.reverseOrder());
        Arrays.sort(arrUpper, Collections.reverseOrder());

        answer = String.join("",arrLower) + String.join("",arrUpper);
        answer.replace(" ", "");
        return answer;
    }
}