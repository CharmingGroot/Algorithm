package algorithm_prac;
import java.util.*;

class nov28 {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> answer_arr_list = new ArrayList<>();
        for(int i : arr){
            answer_arr_list.add(i);
        }
                
        for(int i=0; i< answer_arr_list.size(); i++){
            int tmpValue = arr[i];
            
            int curIdxValue = answer_arr_list.get(i);
            
            if(curIdxValue >= 50 && curIdxValue%2 == 0){
               answer_arr_list.set(i,tmpValue/2);
            }else if(curIdxValue < 50 && !(curIdxValue%2 == 0)){
                answer_arr_list.set(i,tmpValue*2);
            }
        }
        int[] answer = answer_arr_list.stream()
                                        .mapToInt(Integer::intValue)
                                            .toArray();
        
        return answer;
    }
}