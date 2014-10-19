/*
given a sorted array of positive integers with an empty spot (zero) at the end, insert an element in sorted order
*/

public class SortedArrayInsertValueAtEnd{
	public static void main(String[]args){
		int num[] = {1,7,8,19,25,0};
		int val = 12;
		int position = num.length-1;
		while(val < num[position-1]){
			num[position] = num[position - 1];
			position--;
		}
		//System.out.println(counter);
		num[position] = val;
		
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
	}
}
