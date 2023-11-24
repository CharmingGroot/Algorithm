package algorithm_prac;
import java.util.*;

class nov23 {
    public String[] solution(String[] str_list) {
        
        
        // l�� r�� �ε����� ���ϰ�
        // ���� ���Ͽ� ������� �б⸦ ������.
        
        int lIdx = Arrays.asList(str_list).indexOf("l");
        int rIdx = Arrays.asList(str_list).indexOf("r");
        
        if(lIdx == -1) lIdx = str_list.length+1; // "l"�� ���� ��� �ε����� ����� ���ڸ� �ο���.
        if(rIdx == -1) rIdx = str_list.length+1; // "r"�� ���� ��� �ε����� ����� ���ڸ� �ο���.

        ArrayList<String> answerArr = new ArrayList<>();
        
        if(rIdx < lIdx){ // rIdx�� ���� ���
            String[] temp_arr = Arrays.copyOfRange(str_list, rIdx+1, str_list.length);
            for(String i : temp_arr){
                answerArr.add(i);
            }
        }else if(lIdx < rIdx){ // lIdx�� ���� ���
            String[] temp_arr = Arrays.copyOfRange(str_list, 0, lIdx);
            for(String i : temp_arr){
                answerArr.add(i);
            }
        } else {  // �Ѵ� -1�� ���
            
        }
        
        String[] answer  = answerArr.stream()
                .toArray(String[]::new);
        return answer;
    }
}