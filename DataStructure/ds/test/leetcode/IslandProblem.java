/**
 * 
 */
package leetcode;

/**
 * 
 */
public class IslandProblem {

	/**
	 * @param args
	 */
	
	
	

	private static void checkrigtLeftTopBottom(int i,int j,char [][] matrix,int row, int col) {
		
		if(i<0 || j<0 || i>=row || j>=col || matrix[i][j]!='1') {
			return;
		}
		else if( matrix[i][j]=='1')
			matrix[i][j]='2';
		checkrigtLeftTopBottom( i+1, j,  matrix,row,col);
		checkrigtLeftTopBottom( i-1, j,  matrix,row,col);
		checkrigtLeftTopBottom( i, j-1,  matrix,row,col);
		checkrigtLeftTopBottom( i, j+1,  matrix,row,col);
		
	}
private void printMatrix(char [][] matrix){
		
		for(int i= 0;i<matrix.length;i++) {
			for(int j=0; j<matrix.length;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			} 
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
	
		int island = 0;
		char [][] matrix =new char[2][2];
		char x ='0';
		/*
		 * for(int i= 0;i<matrix.length;i++) { for(int j=0; j<matrix.length;j++) {
		 * matrix[i][j]=x;
		 * 
		 * } } matrix[0][0]='1'; matrix[0][2]='1'; matrix[1][1]='1'; matrix[1][2]='1';
		 * matrix[2][0]='1';
		 */
		System.out.println(matrix.length);
		matrix[0][0]='1';
		matrix[1][0]='1';
		int row = matrix.length;
		int col = matrix[0].length;
		
		
		IslandProblem r= new IslandProblem();
		System.out.println("Original Matrix");
		r.printMatrix(matrix);
		
		for(int i= 0;i<row;i++) {
			for(int j=0; j<col;j++) {
				if(matrix[i][j]=='1')
					island+=1;
				checkrigtLeftTopBottom(i,j,matrix,row,col);
			}
		}
		
		System.out.println(island);
		
		
		

	}


}
