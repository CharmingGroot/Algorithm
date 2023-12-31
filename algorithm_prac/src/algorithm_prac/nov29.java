package algorithm_prac;
import java.util.*;
class nov29 {
    public int solution(int[] arr) {

        int answer = this.repeat(arr, 0);
                
        return answer;
    }
    
    public int repeat(int[] arr, int cnt){
        ArrayList<Integer> arr_list = new ArrayList<>();
        
        for(int i : arr){
            if(i >= 50 && i%2 == 0){
                arr_list.add(i/2);    
            }
            else if(i < 50 && !(i%2 == 0)){
                arr_list.add((i*2)+1);    
            }else {
                arr_list.add(i);    
            }
        }       
        
        int[] answer_arr = arr_list.stream()
                                .mapToInt(Integer::intValue)
                                    .toArray();
        
        int[] cur_arr = Arrays.copyOfRange(answer_arr,0,answer_arr.length);
        
        if(Arrays.equals(arr,cur_arr)){
            return cnt;
        } else {
            return this.repeat(cur_arr, cnt+1);
        }
    }
}