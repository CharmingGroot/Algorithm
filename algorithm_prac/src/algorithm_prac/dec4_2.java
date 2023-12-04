package algorithm_prac;
import java.util.*;
class dec4_2 {
    public int[] solution(String myString) {        
        ArrayList<Integer> res_arr = new ArrayList<>();
        
        String[] temp_arr = myString.split("x",myString.length());
        for(int i=0; i< temp_arr.length; i++){
            res_arr.add(temp_arr[i].length());
        }
        
        int[] answer = res_arr.stream()
                                .mapToInt(Integer::intValue)
                                    .toArray();
        
        return answer;
    }
}