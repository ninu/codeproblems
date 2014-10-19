public class BubbleSort{
    private static void bubblesort(int[] num) {
        for (int i = 0; i < num.length; i++) {
    		for (int x = 1; x < num.length - i; x++) {
    			if (num[x - 1] > num[x]) {
    				int temp = num[x - 1];
    				num[x - 1] = num[x];
    				num[x] = temp;
    			}
    		}
    	}
    }
    
    public static void main(String[] args){
    	int[] numbers = { 5, 8, 14, 1, 5678 };
    	bubblesort(numbers);
        for(int j=0; j<numbers.length; j++){
            System.out.println(numbers[j]);
        }
    }
}
