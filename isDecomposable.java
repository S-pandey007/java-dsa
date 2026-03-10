/**
 Chec if strgin is Decompsable into value equual substring ? 

 Rule : 

 1. value equal string "111" , "22".
 2. Exactly one pair of string length 2 and rest string length should be 3.
 3. Return true if string is decomposable otherwise false.
 */



class isDecomposable {
    public static void main(String[] args) {
        String s="00011111000";
        boolean res = isDecomposableOrNot(s);
        System.out.println(res);
    }
    
    static boolean isDecomposableOrNot(String s){
        boolean hasTwo=false;
        int len=s.length();
        int i=0;
        while(i<len){
            int equalStringCount=0;
            char ch=s.charAt(i);
            while(i<len && ch==s.charAt(i)){
                equalStringCount++;
                i++;
            }
            if(equalStringCount%3==1){
                return false ;
            }
            if(equalStringCount%3==2){
                if(hasTwo){
                    return false;
                }
                hasTwo=true;
            }
        }     
        return hasTwo;
    }
}