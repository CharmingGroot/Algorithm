package algorithm_prac;
import java.util.*;
class dec26 {
    public int solution(String num_str) {
        int answer = 0;
        
        char[] str_arr = num_str.toCharArray();
        
        for(char ch : str_arr){
            answer += Integer.parseInt(Character.toString(ch));
        }
        
        
        return answer;
    }
}