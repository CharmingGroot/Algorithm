package algorithm_prac;
import java.util.*;
class dec3_2 {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=myString.length(); i >=0 ; i--){
            String subStr = myString.substring(0,i);
            if(subStr.endsWith(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}