package tp2;

public class Ex8 {
	
	public static void manquants(int[] t) {
        int n = t.length;
        boolean[] existe = new boolean[n + 1];

        for (int x : t)
            if (x >= 1 && x <= n) {
                existe[x] = true;
            }

        for (int i = 1; i <= n; i++)
            if (!existe[i]) {
            	 System.out.println("Manquant : " + i);
            }
               
    }

	public static void main(String[] args) {
		int[] abs = {1,3,3,5};
        manquants(abs);
	}
}
