package algorithm_prac;
import java.util.*;

class dec13 {
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> arr_list = new ArrayList<>();
        
        for(int i: arr){
            arr_list.add(i);
        }
        
        int arr_length = arr.length;
        int target_length = 1;
        
        while(arr_length > target_length){
            target_length *= 2;
        }
        
        int addZero = target_length - arr_length;

        for(int i=0; i< addZero; i++){
            System.out.println("d");
            arr_list.add(0);
        }
        
        int[] answer = arr_list.stream()
                                    .mapToInt(Integer::intValue)
                                        .toArray();
        
        
        
        return answer;
    }
}