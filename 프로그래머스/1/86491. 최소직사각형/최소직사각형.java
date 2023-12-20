class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int witdh = 0;
        int height = 0;
        int allMaxWitdh = 0;
        int allMaxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            witdh = Math.max(sizes[i][0], sizes[i][1]);
            height = Math.min(sizes[i][0], sizes[i][1]);

            allMaxWitdh = Math.max(allMaxWitdh, witdh);
            allMaxHeight = Math.max(allMaxHeight, height);
        }
        answer = allMaxWitdh * allMaxHeight;
        return answer;
    }
}