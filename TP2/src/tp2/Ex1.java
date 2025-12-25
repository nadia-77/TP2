package tp2;

public class Ex1 {

	public static int lis(int[] tab) {
		int n = tab.length;
        if (n == 0) {
        	return 0;
        }

        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[j] < tab[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
    	
    	    int[] tab1 = {2,1,4,2,3,5,1,7};
        System.out.println("Reponse de {2,1,4,2,3,5,1,7} : LIS = " + lis(tab1));
        
        int[][] tests = {
            {},                             
            {5},                            
            {5, 4, 3, 2, 1},                
            {1, 2, 3, 4, 5},                
            {2, 1, 4, 2, 3, 5, 1, 7},       
            {3, 3, 3, 3},                   
            {10, 9, 2, 5, 3, 7, 101, 18}
        };
        System.out.println("Jeux de tests : ");
        for (int[] t : tests) {
            System.out.println("LIS = " + lis(t));
        }
	}

}
