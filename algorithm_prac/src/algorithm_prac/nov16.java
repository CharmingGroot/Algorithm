package algorithm_prac;

import java.util.*;

class nov16 {
    public int[] solution(int start, int end_num) {
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();      
        
        for(int i=start; i > end_num-1; i--){
            answerList.add(i);
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}