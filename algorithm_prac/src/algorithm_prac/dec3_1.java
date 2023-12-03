package algorithm_prac;
import java.util.*;
class dec3_1 {
    public String solution(String myString, String pat) {
                
        int lIdx = myString.lastIndexOf(pat);
                        
        String answer =    myString.substring(0,lIdx+pat.length());    
        
        
        return answer;
    }
}