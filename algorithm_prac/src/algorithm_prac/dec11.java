package algorithm_prac;
import java.util.*;

class dec11 {
    public int[] solution(int[] arr) {
                
        ArrayList<Integer> stk_arr = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(stk_arr.isEmpty()){
                stk_arr.add(arr[i]);
            }
            else if(!stk_arr.isEmpty() && arr[i] == stk_arr.get(stk_arr.size()-1)){
                stk_arr.remove(stk_arr.size()-1);
            }else if(arr[i] != stk_arr.get(stk_arr.size()-1)){
                stk_arr.add(arr[i]);
            }
        }
        
        if(stk_arr.isEmpty()){
            stk_arr.add(-1);
        }
        
        int[] answer = stk_arr.stream()
                                .mapToInt(Integer::intValue)
                                    .toArray();
        
        return answer;
    }
}