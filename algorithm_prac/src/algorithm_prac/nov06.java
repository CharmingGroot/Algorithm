package algorithm_prac;

import java.util.*;

public class nov06 {
    public int[] solution(int []arr) {
        
    	// ����
    	// push()
    	// pop()
    	// peek()
    	// clear()
    	// isEmpty()
    	// �޼���� �̿ܿ��� ������ ����
    	// ���Լ����� ����. LIFO(Last In First Out)
    	// �ܹ��� �����
    	// ���� �켱Ž���� �̿��.
    	// ����Լ��� �����帧�� ����.
        
        Stack<Integer> stk = new Stack<>();
                
        for(int i=0; i< arr.length; i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
            }
            else if(stk.peek().equals(arr[i])){
                continue;
            }
            else {
                stk.push(arr[i]);
            }
        }
        
        int[] answer = new int[stk.size()];
        for(int i=stk.size()-1; i >= 0; i--){
            answer[i] = stk.pop();
        }
        
        

        return answer;
    }
}