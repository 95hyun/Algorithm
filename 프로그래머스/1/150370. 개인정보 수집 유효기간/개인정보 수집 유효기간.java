import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // Map으로 terms 변경
        Map<String, Integer> expireDate = new HashMap<>();
        for (String term : terms) {
            String type = term.split(" ")[0];
            int date = Integer.parseInt(term.split(" ")[1]);
            
            expireDate.put(type, date);
        }
        
        // 다루기 쉽도록 int로 변경
        int todayInt = Integer.parseInt(today.replace(".", ""));

        for (int i = 0; i < privacies.length; i++) {
            // 수집일자와 약관종류 추출
            String privacy = privacies[i];
            int date = Integer.parseInt(privacy.split(" ")[0].replace(".", ""));
            String type = privacy.split(" ")[1];
            
            int year = date/10000;
            int month = (date%10000)/100;
            int day = date%100;
            
            // 기본 연산
            month += expireDate.get(type);
            day -= 1; // 일수 -1 (28>27)

            if (day == 0) {
                // 만약 일수를 빼서 0이 되었으면 말일(28)로 변경
                month -= 1;
                day += 28;
            }

            if (month > 12) {
                // 12월을 넘어갔으면 햇수 증가
                year += (month / 12);
                month = month - 12 * (month / 12);
            }

            if (month == 0) {
                // 위 과정에서 month가 0이 되었으면 직전해 12월로 변경
                month = 12;
                year -= 1;
            }
            
            date = year * 10000 + month * 100 + day;

            if (date < todayInt) {
                answer.add(i);
            }
        }
        
        int[] answerArr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answerArr[i] = answer.get(i) + 1;
        }
        
        return answerArr;
    }
}