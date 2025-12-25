package tp2;

public class Ex7 {

	public static int majoritaire(int[] t) {
        int candidat = 0, count = 0;

        for (int x : t) {
            if (count == 0) {
                candidat = x;
                count = 1;
            } else if (x == candidat) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int x : t) if (x == candidat) {
        	     count++;
        }

        if (count > t.length / 2) {
        	return candidat;
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] maj = {2,2,1,2,3,2,2};
        System.out.println("l'élément majoritaire: "+majoritaire(maj));
	}
}
