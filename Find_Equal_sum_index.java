class Find_Equal_sum_index {
    public static void main(String[] args) {
        int[] a={1,2,3,3}; 
        boolean res=EqualSum(a);
        System.out.print(res);
    }
    
    static boolean EqualSum(int[] a){
         int[] prefix =new int[a.length+1];
        prefix[0]=0;
        
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i-1];
        }
        
        // print prefix
        for(int i=0;i<a.length;i++){
            System.out.println(prefix[i]);
        }
        
        int sum=0;
        for(int i=a.length-1;i>=0;i--){
            if(prefix[i]==sum) return true;
            sum +=a[i];
        }
        
        return false;
       
    }
    

}