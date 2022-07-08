package matrices;

public class SparshMain {

	public static void main(String[] args) {
		Sparsh s = new Sparsh();
		int m = 4;
		int n = 3;
		int[][] arr = {
				{4,0,0},
				{0,0,3},
				{0,1,0},
				{2,0,0}				
		};
		s.storeData(arr, m, n);
	}

}
