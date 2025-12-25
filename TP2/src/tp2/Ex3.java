package tp2;

import java.util.Arrays;

public class Ex3 {

	public static int[][] spirale(int n) {
		int[][] a = new int[n][n];
		int num = 1;

		int top = 0, bottom = n - 1;
		int left = 0, right = n - 1;

		while (top <= bottom && left <= right) {

			for (int j = left; j <= right; j++)
				a[top][j] = num++;
			top++;

			for (int i = top; i <= bottom; i++)
				a[i][right] = num++;
			right--;

			if (top <= bottom) {
				for (int j = right; j >= left; j--)
					a[bottom][j] = num++;
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					a[i][left] = num++;
				left++;
			}
		}
		return a;
	}

	public static void main(String[] args) {

		int[][] sp = spirale(3);
        for (int[] row : sp) System.out.println(Arrays.toString(row));
	}
}
