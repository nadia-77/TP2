package tp2;

public class Ex6 {

	 public static int maxSum(int[] t) {
	        int max1 = t[0];
	        int max2 = t[0];

	        for (int i = 1; i < t.length; i++) {
	            max1 = Math.max(t[i], max1 + t[i]);
	            max2 = Math.max(max2, max1);
	        }

	        return max2;
	    }
	 
	 public static void main(String[] args) {
		 int[] ms = {-2,1,-3,4,-1,2,1,-5,4};
	      System.out.println("La somme maximale : "+maxSum(ms));
	}
}
