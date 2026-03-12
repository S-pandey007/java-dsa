import java.util.*;
class ArangeZeroInEnd {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size : ");
        int n=sc.nextInt();
        System.out.println("enter values : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            arr[i]=value;
        }
        
        // call the method
        ArrangeZero(arr);
        
        // print array 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    static void ArrangeZero(int[] arr){
        int i=0;
        int j=i+1;
        while(i<arr.length && j<arr.length){
            if(arr[i]==0){
                if(arr[j]!=0){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                    i++;
                }else{
                    j++;
                }
            }else{
                i++;
            }
        }
    }
}