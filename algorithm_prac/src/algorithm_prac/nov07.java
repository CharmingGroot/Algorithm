package algorithm_prac;
import java.util.*;

class nov07 {
    public String[] solution(String my_string) {
        
        int strLenth = my_string.length();
        String[] answer = new String[strLenth];
        
        for(int i=0; i< my_string.length(); i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}