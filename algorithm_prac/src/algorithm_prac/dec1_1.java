package algorithm_prac;
import java.util.*;
class dec1_1 {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String up_myString = myString.toUpperCase();
        String up_pat = pat.toUpperCase();
        
        if(up_myString.contains(up_pat)){
            answer = 1;
        }else {
            answer = 0;
        }
        
        
        return answer;
    }
}