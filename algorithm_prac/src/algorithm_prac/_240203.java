package algorithm_prac;
import java.util.ArrayList;
import java.util.*;

class _240203 {
    public int[] solution(int[] arr, int divisor) {
        
        
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        
        for(int i=0; i< arr.length; i++){
            if((arr[i] % divisor) == 0){
                arr_list.add(arr[i]);
            }
        }
        
        if(arr_list.size() == 0){
            arr_list.add(-1);
        }
        
        int[] answer = arr_list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}