package tp2;

public class Ex10 {

	public static boolean magic3(int[][] m) {
        int s = m[0][0] + m[0][1] + m[0][2];

        for (int i = 1; i < 3; i++) {
            int sum = m[i][0] + m[i][1] + m[i][2];
            if (sum != s) {
            	return false;
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = m[0][j] + m[1][j] + m[2][j];
            if (sum != s) {
            	return false;
            }
        }

        int d1 = m[0][0] + m[1][1] + m[2][2];
        int d2 = m[0][2] + m[1][1] + m[2][0];

        return (d1 == s && d2 == s);
    }
	
	public static void main(String[] args) {
		int[][] magic = {
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };
        System.out.println(magic3(magic));
	}
}
