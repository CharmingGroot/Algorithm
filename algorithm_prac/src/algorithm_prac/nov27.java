package algorithm_prac;
import java.util.stream.*;
import java.util.*;


class nov27 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
            
        for(int i=0; i< numbers.length; i++){
            if(answer < n+1){
                answer += numbers[i];
            }else {
                break;
            }
        }        
        return answer;
    }
}