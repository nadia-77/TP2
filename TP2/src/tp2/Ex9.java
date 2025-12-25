package tp2;

public class Ex9 {
	
	public static int diagDiff(int[][] m) {
        int n = m.length;
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            d1 += m[i][i];
            d2 += m[i][n - 1 - i];
        }
        return Math.abs(d1 - d2);
    }

	public static void main(String[] args) {
		int[][] sd = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagDiff(sd));
	}
}
