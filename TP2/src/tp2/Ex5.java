package tp2;

public class Ex5 {

	public static boolean estCirculaire(int[] t) {
        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        for (int x : t) {
            if (x < 1 || x > n) {
            	    return false;            	    
            }
            if (vu[x]) {
            	  return false;
            }
            else {
            	  vu[x] = true;
            }
        
        }
        
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;               
            }
        }

        if (pos == -1) {
        	    return false;
        }

        for (int k = 0; k < n; k++) {
            int idx = (pos + k) % n;
            if (t[idx] != k + 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {4, 5, 1, 2, 3},
            {2, 3, 4, 5, 1},
            {3, 1, 2, 4, 5}
            
        };

        for (int[] t : tests) {
            System.out.println(estCirculaire(t));
        }
        
    }
}
