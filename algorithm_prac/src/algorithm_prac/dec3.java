package algorithm_prac;
import java.util.*;
class dec3 {
    public String solution(String my_string, String alp) {
        
        
        char apl_char = alp.charAt(0);
        char[] my_string_arr = my_string.toCharArray();
        
        for(int i=0; i< my_string_arr.length; i++){
            if(apl_char == my_string_arr[i]){
                my_string_arr[i] = Character.toUpperCase(my_string_arr[i]);
            }
        }
         
        String answer = new String(my_string_arr);
        
        return answer;
    }
}