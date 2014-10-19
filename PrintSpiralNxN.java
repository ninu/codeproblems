public class PrintSpiralNxN{
    public static void printSpiralForm(int[][] a, int length){
        for( int i = 0 , j = length-1 ; i < j ; i++ , j-- ){
            for( int k = i ; k < j ; k++ ){
                System.out.print( a[i][k] + " " ) ;
            }
            for( int k = i ; k < j ; k++ ){
                System.out.print(a[k][j] + " ");
            }
            for( int k = j ; k > i ; k-- ){
                System.out.print(a[j][k] + " ");
            }
            for( int k = j ; k > i ; k-- ){
                System.out.print( a[k][i] + " " );
            }
        }
    }

	public static void main(String[] args){
		int[][] numbers = { 
            {2, 4, 6, 8},
            {5, 9, 12, 16},
            {2, 11, 5, 9},
            {3, 2, 1, 8}
            };
        printSpiralForm(numbers,4);
        // http://www.sumeetkataria.com/2012/12/print-two-dimensional-nn-and-mn-matrix-in-spiral-form/
	}
}
