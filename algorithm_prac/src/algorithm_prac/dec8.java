package algorithm_prac;
import java.util.*;

class dec8 {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer_arr = new ArrayList<>();
        
        for(int i=0; i< arr.length; i++){
            
            if(flag[i] == true){
                for(int j=0; j< arr[i]*2; j++){
                    answer_arr.add(arr[i]);
                }
                                                
            }else{
            for(int j=0; j< arr[i]; j++){
                    answer_arr.remove(answer_arr.size()-1);
                }
            }
            
           
            
        }        
                
        int[] answer = answer_arr.stream()
                                    .mapToInt(Integer::intValue)
                                        .toArray();
        
        
        
        return answer;
    }
}