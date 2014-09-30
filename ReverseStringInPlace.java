public class ReverseStringInPlace{
	public static void main(String[]args){
		char [] str = {'w','e','l','c','o','m','e'};
		str = reverse(str);
		String newString1 = new String(str);
		System.out.println(newString1);
	}
	
	public static char[] reverse(char[] str){
		for(int i=0,j=str.length-1; i < str.length/2; i++,j--){
			char c = str[i]; // w
			str[i] = str[j]; // e
			str[j] = c; // w 
		}
		return str;
	}
}