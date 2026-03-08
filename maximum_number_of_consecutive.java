class maximum_number_of_consecutive {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,1};
        int zerosCount=0;
        int onesCount=0;
        int MaxonesCount=0;
        int MaxzerosCount=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerosCount++;
                onesCount=0;
                if(zerosCount>MaxzerosCount){
                    MaxzerosCount=zerosCount;
                }
            }
            if(arr[i]==1){
                onesCount++;
                zerosCount=0;
                if(onesCount>MaxonesCount){
                    MaxonesCount=onesCount;
                }
            }
        }
        
        if(MaxonesCount>MaxzerosCount){
            System.out.println("The maximum number or consecutive 1's in the array is "+MaxonesCount);
        }else{
            System.out.println("The maximum number or consecutive 0's in the array is "+MaxzerosCount);
        }

    }
}