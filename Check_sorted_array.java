class Check_sorted_array {
    public static void main(String[] args) {
        // int[] arr = {4,3,2,1};
        int[] arr = {1,2,3,4};

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                increasing = false;
            }

            if(arr[i] < arr[i + 1]) {
                decreasing = false;
            }
            if(!increasing && !decreasing){
                break ;
            }
        }

        if(increasing || decreasing) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}
