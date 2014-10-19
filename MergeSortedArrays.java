public class MergeTwoSortedArrays{
	public static int[] merge(int[] a, int[] b){
		int[] answer = new int[a.length + b.length];
		int i=0, j=0, k=0;
		while(i < a.length && j < b.length){
			if(a[i] < b[j]){
				answer[k] = a[i];
				i++;
			}
			else{
				answer[k] = b[j];
				j++;
			}
			k++;
		}
		
		while (i < a.length){
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length){
			answer[k] = b[j];
			j++;
			k++;
		}
		return answer;
	}
	
	public static void main(String[]args){
		int[] a = {1,3,4,5,9};
		int[] b = {0,1,2,6,8,13,22,24,25};
		
		int[] themergedarray = merge(a,b);
		
		for(int i=0; i < themergedarray.length; i++){
			System.out.print(themergedarray[i] + ",");
		}
		System.out.println("");
	}
}
