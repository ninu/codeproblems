public class PrintSpiralMxN{
    public static void printSpiralForm(int[][] a, int row, int col, int level) {  
        if(row <= 0 || col <= 0) 
    		return;  
    	if(row == 1) {  
    		for(int i=0; i<col; i++)  
    			System.out.print(a[level][level+i] + " ");  
    		return;  
    	}  
    
    	if(col == 1) {  
    		for(int i=0; i<row; i++)  
    			System.out.print(a[level+i][level] + " ");  
    		return;  
    	}  
    
    	for(int i=0; i<col-1; i++)
    		System.out.print( a[level][level+i] + " ");  
    
    	for(int i=0; i<row-1; i++)
    		System.out.print( a[level+i][col-1+level] + " ");  
    
    	for(int i=0; i<col-1; i++)
    		System.out.print( a[row-1+level][col-1+level-i] + " ");  
    
    	for(int i=0; i<row-1; i++)
    		System.out.print( a[row-1+level-i][level] + " ");  
    
    	printSpiralForm(a, row-2, col-2, level+1);  
    }

	public static void main(String[] args){
    int[][] arr = {
        { 1, 2, 3, 4, 5},
        { 6, 7, 8, 9,10}, 
        {11,12,13,14,15}, 
        {16,17,18,19,20} 
    };

    printSpiralForm(arr, 4, 5, 0);
        // http://www.sumeetkataria.com/2012/12/print-two-dimensional-nn-and-mn-matrix-in-spiral-form/
	}
}
