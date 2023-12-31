package algorithm_prac;
import java.util.*;

class nov23 {
    public String[] solution(String[] str_list) {
        
        
        // l과 r의 인덱스를 구하고
        // 둘을 비교하여 순위대로 분기를 나누기.
        
        int lIdx = Arrays.asList(str_list).indexOf("l");
        int rIdx = Arrays.asList(str_list).indexOf("r");
        
        if(lIdx == -1) lIdx = str_list.length+1; // "l"이 없는 경우 인덱스를 벗어나는 숫자를 부여함.
        if(rIdx == -1) rIdx = str_list.length+1; // "r"이 없는 경우 인덱스를 벗어나는 숫자를 부여함.

        ArrayList<String> answerArr = new ArrayList<>();
        
        if(rIdx < lIdx){ // rIdx가 작은 경우
            String[] temp_arr = Arrays.copyOfRange(str_list, rIdx+1, str_list.length);
            for(String i : temp_arr){
                answerArr.add(i);
            }
        }else if(lIdx < rIdx){ // lIdx가 작은 경우
            String[] temp_arr = Arrays.copyOfRange(str_list, 0, lIdx);
            for(String i : temp_arr){
                answerArr.add(i);
            }
        } else {  // 둘다 -1인 경우
            
        }
        
        String[] answer  = answerArr.stream()
                .toArray(String[]::new);
        return answer;
    }
}