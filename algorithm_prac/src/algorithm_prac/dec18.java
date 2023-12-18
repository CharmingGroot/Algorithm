package algorithm_prac;
import java.util.*;
class dec18 {
    public int[] solution(int[] arr, int n) {
       
        
        if(arr.length%2 == 0){
            for(int i=0; i< arr.length; i++){
                if(!(i%2 == 0)){
                    arr[i] += n;   
                }
            }
        }else if(!(arr.length%2 == 0)){
            for(int i=0; i< arr.length; i++){
                
                if((i%2 == 0)){
                    arr[i] += n;   
                }
            }
        }
        
         int[] answer = new int[arr.length];
        
        for(int i=0; i< answer.length; i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}