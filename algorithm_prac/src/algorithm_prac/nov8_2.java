package algorithm_prac;
import java.util.*;

class nov8_2 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
                
        int my_string_size = my_string.length();
        if(my_string_size < is_prefix.length()) {
            return 0;
        }
        
        ArrayList<String> my_string_arr = new ArrayList<>(my_string_size);
        
        for(int i=0; i<my_string.length();  i++){
            if(i==0){
                my_string_arr.add(my_string.substring(0));    
            }
            else {
                my_string_arr.add(my_string.substring(0,i));
            }
        }
        
        if(!my_string_arr.contains(is_prefix)){
            answer = 0;
        }else {
            answer = 1;
        }
        
        
        return answer;
    }
}