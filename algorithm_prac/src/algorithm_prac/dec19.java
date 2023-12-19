package algorithm_prac;
import java.util.*;
class dec19 {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        ArrayList<Integer> temp_arr = new ArrayList<>();
                                
        for(int i=0; i< num_list.length; i++){
            if(i>4) temp_arr.add(num_list[i]);
        }
        
        int[] answer =    temp_arr.stream()
                                    .mapToInt(Integer::intValue)
                                        .toArray();
        
        return answer;
    }
}