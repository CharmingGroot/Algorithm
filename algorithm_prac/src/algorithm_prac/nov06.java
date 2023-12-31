package algorithm_prac;

import java.util.*;

public class nov06 {
    public int[] solution(int []arr) {
        
    	// 스택
    	// push()
    	// pop()
    	// peek()
    	// clear()
    	// isEmpty()
    	// 메서드는 이외에도 여러개 많음
    	// 후입선출의 구조. LIFO(Last In First Out)
    	// 단방향 입출력
    	// 깊이 우선탐색에 이용됨.
    	// 재귀함수의 동작흐름과 유사.
        
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
