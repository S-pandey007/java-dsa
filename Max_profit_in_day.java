// An array prices[]

// Each element represents the stock price on that day

// Example:

// prices = [7, 1, 5, 3, 6, 4]

// Means:

// Day 1 → price = 7

// Day 2 → price = 1

// Day 3 → price = 5

// Day 4 → price = 3

// Day 5 → price = 6

// Day 6 → price = 4

// The maximum possible profit

class Max_profit_in_day {
    public static void main(String[] args) {
        int[] arr={7, 1, 5, 3, 6, 4};
        
        int profit=0;
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else{
                if(profit<arr[i]-min)
                {
                    profit=arr[i]-min;
                }
            }
        }
        System.out.print(profit);
    }
}