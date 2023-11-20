package algorithm_prac;
import java.util.*;

class nov20_1 {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> temp_arr = new ArrayList<>();
        
        for(int i=0; i < intervals.length; i++){
           int[] arrA = Arrays.copyOfRange(arr,intervals[i][0],intervals[i][1]+1);
            for(int j=0; j< arrA.length; j++){
                temp_arr.add(arrA[j]);
            }
        }

        int[] answer = temp_arr.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}