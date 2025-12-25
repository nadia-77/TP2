package tp2;

public class Ex2 {
	
	public static void tabpivots(int[] tab) {
        int n = tab.length;

        for (int i = 1; i < n-1; i++) {
            boolean resultas = true;

            for (int j = 0; j < i; j++)
                if (tab[j] > tab[i]) {
                	resultas = false;                	
                }

            for (int j = i + 1; j < n; j++)
                if (tab[j] < tab[i]) {
                	resultas = false;
                }

            if (resultas) {
            	System.out.println("Pivot : " + tab[i]);
            	}
        }
        
    }

	public static void main(String[] args) {
        int[] t = {2, 4, 3, 5, 6};
        tabpivots(t);
    }
}
