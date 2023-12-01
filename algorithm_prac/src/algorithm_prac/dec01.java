package algorithm_prac;
import java.util.*;
class dec01 {
    public int solution(int[] num_list) {
        int answer = 0;
        
        ArrayList<Integer> temp_arr = new ArrayList<>();
        for(int num : num_list){
            temp_arr.add(num);
        }
        
        
        if(temp_arr.size() >= 11){
            answer = temp_arr.stream()
                                .reduce(0,(a,b) -> a+b);
        }else if(temp_arr.size() <= 10){
            answer = temp_arr.stream()
                                .reduce(1,(a,b) -> a*b);
        }
        
        return answer;
    }
}