class Find_second_largest_value_in_array {
    public static void main(String[] args) {
        int arr[]={1};
        int res =checkSecondHighestVlue(arr);
        if(res==-1){
            System.out.print("Not Found Second largest value in array");
        }else{
            System.out.print("Second largest value in array : "+res);
        }
    }
    
    static int checkSecondHighestVlue(int[] arr){
        
        int maxValue=arr[0];
        int SecMaxValue=-1;
        
        if(arr.length<2){
            return -1;
        }
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]>maxValue){
                SecMaxValue=maxValue;
                maxValue=arr[i];
            }
            if(arr[i]>SecMaxValue && arr[i]<maxValue){
                SecMaxValue=arr[i];
            }
        }
        // System.out.print("Second largest value in array : "+SecMaxValue);
        return SecMaxValue;
    }
}