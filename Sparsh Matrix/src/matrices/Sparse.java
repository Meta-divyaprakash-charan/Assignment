package matrices;

final public class Sparse {
	private int[][] array;
	private int[][] sparseMatrix;
	private int size;
	
	public Sparse(int[][] inputMatrix){
		size = 0;
		array = inputMatrix;
		storeItem();
	}

	private void storeItem() {
		nonZero(array, array.length, array[0].length);
		sparseMatrix = new int[3][size];
		int row = array.length;
		int col = array[0].length;
		int k=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(array[i][j]!=0){
					sparseMatrix[0][k] = i;
					sparseMatrix[1][k] = j;
					sparseMatrix[2][k] = array[i][j];
					k++;
			}
		}
	}
}

	public void nonZero(int arr[][], int row, int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j]!=0){
					size++;
				}
			}
		}
	}
	
	public void transpose(){
		int [][] transposeSparse = this.sparseMatrix;
			for(int j=0;j<this.size;j++)
			{
				int temp = transposeSparse[0][j];
				transposeSparse[0][j] = transposeSparse[1][j];
				transposeSparse[1][j] = temp;
 			}
	}
	
	public void show(){
		for(int i=0;i<3;i++){
			for(int j=0;j<this.size;j++){
				System.out.print(this.sparseMatrix[i][j] + " ");
			}
				System.out.println("");
		}
	}

	public static void main(String[] args) {
		int[][] input = {  {0,0,3,0},
						   {4,0,0,1},
						   {0,2,0,0}
						};
		Sparse s = new Sparse(input);
		s.show();
	}
}
