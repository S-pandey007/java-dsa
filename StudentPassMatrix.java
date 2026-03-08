class StudentPassMatrix{
    public static void main(String[] args) {
        
        // Test Case 1:
        int[][] arr = { {60,70,80},
                        {40,50,60},
                        {30,40,50} };
        
        // Test Case 2:
        // int[][] arr = { {55,60,45,50},
        //                 {20,30,40,50}};
        
        // Test Case 3:
        // int[][] arr = { {10,20,30,40,50}};
        
        double sum=0;
        int numberOfPassedStudent=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
                double avg = sum/arr[i].length;
                if(avg>=50){
                    numberOfPassedStudent++;
                }
                sum=0;
        }

        System.out.println("number Of Passed Student : "+numberOfPassedStudent);
        
    }
}