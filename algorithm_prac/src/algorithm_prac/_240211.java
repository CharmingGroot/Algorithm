package algorithm_prac;
import java.util.*;
import java.util.Arrays;
class _240211 {
    public int[] solution(String s) {
        
        
        ArrayList<Integer> res_arr = new ArrayList<Integer>();
        char[] s_charArr = s.toCharArray();
        
        for(int i=0; i< s_charArr.length; i++){
            int dupIdx = s.substring(0, i).lastIndexOf(s_charArr[i]);
            if(dupIdx == -1){
                res_arr.add(-1);
            }else {
                // ÇöÀç index - dupIdx
                res_arr.add(i - dupIdx);
            }
        }
        
        int[] answer = res_arr.stream()
                                .mapToInt(Integer :: intValue)
                                    .toArray();
        
        return answer;
    }
}