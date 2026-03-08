import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,1,2,2,3,4,6,6,6,8,8,3};
    
        // using array list
        
        // ArrayList<Integer> list =new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(!list.contains(arr[i])){
        //         list.add(arr[i]);
        //     }
        // }
        
        // using hash map
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
         set.add(arr[i]);
        }
        
        System.out.print(set);
    }
}