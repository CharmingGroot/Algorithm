package algorithm_prac;
import java.util.*;

class nov08 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int my_string_size = my_string.length();
        ArrayList<String> tail = new ArrayList<>(my_string_size);
        
        for(int i=0; i < my_string.length(); i++){
            tail.add(my_string.substring(i));
        }
        
        if(!tail.contains(is_suffix)){
          answer = 0;  
        } 
        else {
            answer = 1;
        }
        
        return answer;
    }
}
