package algorithm_prac;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer_arr = new ArrayList<>();
        
        for(int i=0; i< arr.length; i++){
            
            if(flag[i] == true){
                answer_arr.add(arr[i]);
                answer_arr.add(arr[i]);
                                                
            }else{
                answer_arr.stream()
                            .range
                
            }
            
           
            
        }        
        
         System.out.println(answer_arr);
        
        int[] answer = answer_arr.stream()
                                    .mapToInt(Integer::intValue)
                                        .toArray();
        
        
        
        return answer;
    }
}