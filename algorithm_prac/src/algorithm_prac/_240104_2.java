package algorithm_prac;
import java.util.*;

class _240104_2 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        String tmp_date1 = date1[0] + "" + date1[1] + "" + date1[2]+ "";
        String tmp_date2 = date2[0] + "" + date2[1] + "" + date2[2]+ "";
        
        if(Integer.parseInt(tmp_date1) < Integer.parseInt(tmp_date2)){
            answer = 1;
        }
        
        return answer;
    }
}