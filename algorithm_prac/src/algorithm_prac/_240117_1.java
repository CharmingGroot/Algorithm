package algorithm_prac;
import java.util.*;

public class _240117_1 {
    public int solution(int n) {
        int answer = 0;

        char[] number_arr = Integer.toString(n).toCharArray();
        
        for(int i=0; i< number_arr.length; i++){
            answer += Character.getNumericValue(number_arr[i]);
        }
        

        return answer;
    }
}