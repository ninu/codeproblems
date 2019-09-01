// using recursion

/*
*  Example using an int of 234
*  234 / 10 = 23
*  234 % 10 = 4
*  
*  23 / 10 = 2
*  23 % 10 = 3
*  
*  2 / 10 = 0
*  2 % 10 = 2
*
*/

public class ComputeSum{
    public static int sum(int a){
        if((a / 10) > 0){
            return (a % 10) + sum(a / 10);
        }
        else{
            return a % 10;
        }
    }
     public static void main(String []args){
        System.out.println(sum(234));
     }
}
