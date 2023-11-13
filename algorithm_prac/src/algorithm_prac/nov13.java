package algorithm_prac;

import java.util.*;

class nov13 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char[] my_string_arr = my_string.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(char c : my_string_arr){
            charList.add(c);
        }
        
        char sIdx = 65; // 65 ~ 90
        char sIdx2 = 97; // 97 ~ 122
        int cnt = 0; // 반복회수 파악을 위한 변수
        
        // 52번 반복
        for(int i=0; i< 52; i++){
            if(i < 26){
                cnt = Collections.frequency(charList, (char)sIdx);
                answer[i] = cnt;
                sIdx++;
            }
            else if(i >= 26){
                cnt = Collections.frequency(charList, (char)sIdx2);
                answer[i] = cnt;
                sIdx2++;
            }
        }
        
        // 오늘은 내 생일!
        return answer;
    }
}