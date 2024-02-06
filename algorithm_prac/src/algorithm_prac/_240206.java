package algorithm_prac;
import java.util.*;
class _240206 {
    public String solution(String s) {
        String answer = "";
        
        char[] s_char_arr = s.toCharArray();
        
        Arrays.sort(s_char_arr);
        
        return new StringBuilder(new String(s_char_arr)).reverse().toString();
    }
}