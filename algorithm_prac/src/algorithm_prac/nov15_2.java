package algorithm_prac;

import java.util.*;

class nov15_2 {
    public String solution(String my_string, int[] indices) {
        
        StringBuffer my_string_buffer = new StringBuffer(my_string);
        
        Arrays.sort(indices);
        
        for(int i=0; i< indices.length; i++){
            my_string_buffer = my_string_buffer.deleteCharAt(indices[i]); 
            for(int j=0; j < indices.length; j++){
                indices[j]--; // 모든 정수값을 1만큼 감소시킴.
            }
        }
        
        String answer = my_string_buffer.toString();
        
        return answer;
    }
}