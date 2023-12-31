package algorithm_prac;
import java.util.*;

class nov30 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            answer += repeat(num);
        }        
        return answer;
    } 
    public int repeat(int num){
        int cnt = 0; 
        while(num != 1){
            if(num%2 ==0){
                num /= 2;
            }else {
                num = (num -1)/2;
            }
            cnt++;
        }
        return cnt;
    }
}