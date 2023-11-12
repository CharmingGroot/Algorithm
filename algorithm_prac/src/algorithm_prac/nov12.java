package algorithm_prac;

import java.util.*;

class nov12 {
    public String solution(int q, int r, String code) {
        // code의 길이만큼 반복
        // 각 인덱스의 값이 나머지 배열의 인덱스의 값과 같은 경우 이어붙이기
        
        // StringBuffer 사용하면 될듯?
        
        char[] code_arr = code.toCharArray(); // 문자배열
        StringBuffer code_buffer = new StringBuffer(); // 붙인 문자열이 될 버퍼
        
        // code의 길이만큼 반복하여
        // 나머지 배열을 구하기.
        for(int i=0; i< code_arr.length; i++){
            if(i%q == r){
               code_buffer.append(code_arr[i]);
            }
        }
        
        String answer = code_buffer.toString();
        
        return answer;
    }
}