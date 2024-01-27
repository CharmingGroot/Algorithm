package algorithm_prac;
import java.util.ArrayList;
import java.util.Collections;
class _240127 {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        for(int i : arr){
            arr_list.add(i);
        }
        
        int minValueIdx = Collections.min(arr_list);
        
        arr_list.remove(arr_list.indexOf(minValueIdx));
        
        if(arr_list.size() == 0){
            arr_list.add(-1);
        }
        
        int[] answer = arr_list.stream().mapToInt(Integer :: intValue).toArray();
        
        return answer;
    }
}