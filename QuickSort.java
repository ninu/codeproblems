public class QuickSort{

    public static int partition(int[]A, int start, int end){
        int pivot = A[end];
        int partitionIndex = start; // set partition index as start initially
        for(int i=start; i<end; i++){
            if(A[i] <= pivot){
                //swap(A[i], A[partitionIndex], A); // swap if element is lesser than pivot
                int temp = A[i];
                A[i] = A[partitionIndex];
                A[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        //swap(A[partitionIndex], A[end], A); // swap pivot with element at partition index
        int temp = A[partitionIndex];
        A[partitionIndex] = A[end];
        A[end] = temp;
        
        return partitionIndex;
    }
    
    public static void quicksort(int[]A, int start, int end){
        if(start < end){
            int partitionIndex = partition(A, start, end); // calling partition
            quicksort(A, start, partitionIndex-1);
            quicksort(A, partitionIndex+1, end);
        }
    }
    
    public static void main(String []args){
        int[] A = {8,3,1,7,3,4,5,9};
        quicksort(A,0,7);

        for(int m=0; m<A.length; m++){
            System.out.println(A[m]);
        }
     }
}
