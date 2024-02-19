import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); // 재료를 저장할 스택

        for (int ing : ingredient) {
            stack.push(ing); // 현재 재료를 스택에 넣음

            // 스택의 크기가 4 이상이고, 스택의 마지막 4개 재료가 '빵-야채-고기-빵' 순서인지 확인
            if (stack.size() >= 4) {
                List<Integer> lastFour = stack.subList(stack.size() - 4, stack.size());
                if (lastFour.equals(Arrays.asList(1, 2, 3, 1))) {
                    // 조건을 만족하면 해당 재료 4개를 스택에서 제거
                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    answer++; // 햄버거 포장 개수 증가
                }
            }
        }
        return answer;
    }
}