package algorithm_prac;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> answer_arr = new ArrayList<>();
        
        for(int i : arr){
            for(int j=0; j < i; j++){
                answer_arr.add(i);
            }
                
        }
        
        int[] answer = answer_arr.stream()
                                    .mapToInt(Integer::intValue)
                                        .toArray();
        
        return answer;
    }
}