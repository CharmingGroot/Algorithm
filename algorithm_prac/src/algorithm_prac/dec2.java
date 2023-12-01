package algorithm_prac;
import java.util.*;
class dec2 {
    public String solution(String myString) {
        
        
        char[] myString_char_arr = myString.toCharArray();
        
        for(int i=0; i<myString_char_arr.length; i++){
            
            if(myString_char_arr[i] == ('a')){
                myString_char_arr[i] = 'A';
            }else if(Character.isUpperCase(myString_char_arr[i]) && !(myString_char_arr[i] == ('A'))){
                char ch = Character.toLowerCase(myString_char_arr[i]);
                myString_char_arr[i] = ch;
            }else {
                
            }
        }
        
        String answer = new String(myString_char_arr);
        
        
        return answer;
    }
}