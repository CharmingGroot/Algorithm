package algorithm_prac;

import java.util.*;

class nov12 {
    public String solution(int q, int r, String code) {
        // code�� ���̸�ŭ �ݺ�
        // �� �ε����� ���� ������ �迭�� �ε����� ���� ���� ��� �̾���̱�
        
        // StringBuffer ����ϸ� �ɵ�?
        
        char[] code_arr = code.toCharArray(); // ���ڹ迭
        StringBuffer code_buffer = new StringBuffer(); // ���� ���ڿ��� �� ����
        
        // code�� ���̸�ŭ �ݺ��Ͽ�
        // ������ �迭�� ���ϱ�.
        for(int i=0; i< code_arr.length; i++){
            if(i%q == r){
               code_buffer.append(code_arr[i]);
            }
        }
        
        String answer = code_buffer.toString();
        
        return answer;
    }
}