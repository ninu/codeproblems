public class Anagrams{
	
	public static void generateAnagram(String prefix, String str){
		int n = str.length();
		if (n == 0){
			System.out.println(prefix);
		}
		else {
			for (int i = 0; i < n; i++){
				//System.out.println("debug --> " + prefix + str.charAt(i) + " -- " + str.substring(0, i) + str.substring(i+1, n));
				generateAnagram(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
	}

	public static void main(String[] args){
		generateAnagram("","abc");
		
	}
	/*
		debug --> a -- bc
		debug --> ab -- c
		debug --> abc -- 
OUTPUT	abc
		debug --> ac -- b
		debug --> acb -- 
OUTPUT	acb
		debug --> b -- ac
		debug --> ba -- c
		debug --> bac -- 
OUTPUT	bac
		debug --> bc -- a
		debug --> bca -- 
OUTPUT	bca
		debug --> c -- ab
		debug --> ca -- b
		debug --> cab -- 
OUTPUT	cab
		debug --> cb -- a
		debug --> cba -- 
OUTPUT	cba
	*/
}
