class Rotate_array_given_d {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};    
        int n=a.length;
        int d=2;
        d=d%n;
        
        int i=0;
        int j=d-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
        i=d;
        j=n-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
        i=0;
        j=n-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
        //print
        for(int x=0;x<n;x++){
            System.out.print(" "+a[x]+" ");
        }
    }
    

}