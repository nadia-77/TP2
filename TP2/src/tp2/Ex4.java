package tp2;

import java.util.Stack;

public class Ex4 {
	
	private static int maxHist(int[] row) {
        Stack<Integer> s = new Stack<>();
        int max = 0;
        int i = 0;

        while (i < row.length) {
            if (s.isEmpty() || row[s.peek()] <= row[i]) {
                s.push(i++);
            } else {
                int top = s.pop();
                int area = row[top] * (s.isEmpty() ? i : i - s.peek() - 1);
                max = Math.max(max, area);
            }
        }

        while (!s.isEmpty()) {
            int top = s.pop();
            int area = row[top] * (s.isEmpty() ? i : i - s.peek() - 1);
            max = Math.max(max, area);
        }

        return max;
    }

    public static int maxRectangle(int[][] M) {
        int[] temp = M[0].clone();
        int result = maxHist(temp);

        for (int i = 1; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                	   temp[j] = 0;
                }
                    
                else {
                    temp[j]++;
                }
            }

            result = Math.max(result, maxHist(temp));
        }

        return result;
    }

    public static void main(String[] args) {
    	int[][] M = {
                {0, 1, 1, 0, 1},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 0, 0, 0}
            };

      int maxArea = maxRectangle(M);
      System.out.println("L'Aire maximale : " + maxArea);
        
	}
}
