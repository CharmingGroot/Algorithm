package algorithm_prac;
import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = this.repeat(strArr);
                        
        return answer;
    }
    
    public String[] repeat(String[] arr){
        
        ArrayList<String> new_arr = new ArrayList<>();
        
        for(int i=0; i< arr.length; i++){
            
            int lIdx = arr[i].indexOf("ad");
            
           if(lIdx == -1){
               new_arr.add(arr[i]);
           }            
        }
        
        String[] result_arr = new_arr.toArray(new String[new_arr.size()]);
        
        return result_arr;
    }
}