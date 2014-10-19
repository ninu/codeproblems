public class SelectionSort{
    public static int[] selectionsort(int[]A) {
        int n = A.length;
        for(int i=0; i<n; i++){
            int iMin = i; //ith position elements from i till n-1 are candidates
            for(int j=i+1; j<n; j++){
                if(A[j] < A[iMin]){
                    iMin = j; //update the index of minimum element
                }
            }
            int temp = A[i];
            A[i] = A[iMin];
            A[iMin] = temp;
        }
        return A;
    }
    
    public static void main(String []args){
        int[] A = {8,3,1,7,3,4,5};
        int[] output = selectionsort(A);

        for(int m=0; m<output.length; m++){
            System.out.println(output[m]);
        }
     }
}
