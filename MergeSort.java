public class MergeSort{
    public static void merge(int[]L, int[]R, int[]A) { 
        int i=0, j=0, k=0;
        int nL = L.length;
        int nR = R.length;
        
	// compare two arrays with each element and add back to main A[]
        while(i < nL && j < nR){
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
			k++;
        }
        while(i < L.length){
            A[k] = L[i];
            i++;
            k++;
        }
        while(j < R.length){
            A[k] = R[j];
            j++;
            k++;
        }        
    }
    
    public static int[] mergesort(int[]A){
        int n = A.length;
        if(n < 2)
            return A;
        int midpoint = n/2;
        int[]L = new int[midpoint];
        int[]R = new int[n-midpoint];
        
        for(int c=0; c<midpoint; c++){
            L[c] = A[c];
        }
        for(int c=midpoint; c<A.length;c++){
            R[c-midpoint] = A[c];
        }
        
        mergesort(L);
        mergesort(R);
        merge(L,R,A);
        
        return A;

    }

    public static void main(String []args){
        int[] A = {8,3,1,7,3,4,5};
        int[] output = mergesort(A);

        for(int m=0; m<output.length; m++){
            System.out.println(output[m]);
        }
     }
}
