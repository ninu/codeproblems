public class ExcelToNumber {

    /**
     * @param args the command line arguments
     */
    
    private static final String STR = "ABCDE";
    
    public static int determinePosition(char c,int position){
        int charVal = c - 64;
        if(position > 0){
            return (int)Math.pow(26,position)*charVal;
        }else
            return charVal;
    }
    
    public static void generateValue(){
        int position = 0;
        int value = 0;
        for(int i=STR.length(); i>0; i--){
            char c = STR.charAt(i-1);
            value += determinePosition(c,position);
            //System.out.println(c);
            //System.out.println(position);
            position++;
        }
        System.out.println(STR + " => " + value);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        generateValue();
    }
}
