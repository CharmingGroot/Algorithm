package algorithm_prac;
import java.util.*;

class nov25 {
    public int[] solution(int[] num_list, int n) {
        
        
        ArrayList<Integer> tempArr = new ArrayList<>();
        
        for(int i=0; i< num_list.length; i+=n){
            tempArr.add(num_list[i]);
        }
        
        int[] answer = tempArr.stream()
                                 .mapToInt(Integer::intValue)
                                      .toArray();
        
        return answer;
    }
}