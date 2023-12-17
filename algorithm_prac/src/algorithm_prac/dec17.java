package algorithm_prac;
import java.util.*;
class dec17 {
    public int solution(String[] strArr) {
        int max_length = 0;
        for(int i=0; i< strArr.length; i++){
            if(max_length < strArr[i].length()) max_length = strArr[i].length();
        }
        
        
        int[] answer = new int[strArr.length];
        
        for(int i=0; i< strArr.length; i++){
            answer[strArr[i].length()]++;
        }
        
        return Arrays.stream(answer).max().getAsInt();
    }
}