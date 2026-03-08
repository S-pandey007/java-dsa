import java.util.ArrayList;

public class IsCryptic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int start=10;
        int end=50;
        
        for(int i=start;i<=end;i++){
            boolean res = IsCrypticNumber(i);
            if(res){
                list.add(i);
            }
        }
        
        System.out.print(list);
        
    }
    
    // check polindrome
    static boolean checkPolindrome(int n){
        int num=n;
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(num==sum){
            return true;
        }else{
            return false;
        }
    }
    
    //check repeated digit
    static boolean checkRepeatedDigit(int n){
        String num = Integer.toString(n);
        for(int i=0;i<num.length();i++){
            for(int j=i+1;j<num.length();j++){
                if(num.charAt(i)==num.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    // check cryptic number
    static boolean IsCrypticNumber(int n){
        boolean isCryptic=true;
        
        if(n%7!=0){
            isCryptic=false;
        }
        if(n%5==0){
            isCryptic=false;
        }
        
        boolean res = checkPolindrome(n);
        if(res){
            isCryptic=false;
        }
        
         boolean repetated = checkRepeatedDigit(120);
         if(repetated){
            isCryptic=false;
        }
         
        return isCryptic;
        
    }
    
}
