package algorithm_prac;
import java.util.*;
class _240109 {
    public String solution(String myString) {
        String answer = "";
        
        char[] char_arr = myString.toCharArray();
                
        for(char ch : char_arr){
            if(ch < 108) answer += "l";
            else answer += ch;
        }
        
        return answer;
    }
}