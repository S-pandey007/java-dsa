import java.util.*;
class CountNumberOfSunday {
    public static void main(String[] args) {
        String day="monday";
        int dayCount=21;
        int numberOfSunday = countNumberOfSunday(day,dayCount);
        System.out.print(numberOfSunday+" sunday's occure in "+dayCount+" days");
    }
    
    static int countNumberOfSunday(String day, int dayCount){
        Map<String,Integer> m=new HashMap<>();
        m.put("monday",7);
        m.put("tuesday",6);
        m.put("wednesday",5);
        m.put("thursday",4);
        m.put("friday",3);
        m.put("saturday",2);
        m.put("sunday",1);
        
        int fallSunday=m.get(day);
        if(dayCount<=fallSunday){
            return 0;
        }
        return 1+(dayCount-fallSunday)/7;
        
    }
}