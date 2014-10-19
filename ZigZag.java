public class ZigZag{

    public static void printRightToLeftDiagonal(int[][] a, int row, int col, int diagonalNo){
        int i, j;  
    
    	i = diagonalNo < col ? 0 : ((diagonalNo + 1) - col);  
    	j = diagonalNo < col ? diagonalNo : (col-1);  
    
    	for(int p = i, q = j; p < row && q >= 0; p++, q--){   
    		System.out.print(a[p][q] + " -> ");  
    	}
    }
    public static void printZigzagFormUsingDiagonals(int[][] a, int row, int col) {  
    	int diagonalCount = row + col - 1;  
    	for(int i = 0; i< diagonalCount; i++) {  
			printRightToLeftDiagonal(a, row, col, i);
        }  
    	System.out.println();  
    }
    public static void main(String []args){
        int[][] arr = {
            { 1, 2, 3, 4},
            { 6, 7, 8, 9},
            {11,12,13,14}
        };
        printZigzagFormUsingDiagonals(arr, 3, 4);
    }
}
