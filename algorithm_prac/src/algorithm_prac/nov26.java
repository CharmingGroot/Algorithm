package algorithm_prac;
import java.util.*;
import java.util.stream.IntStream;

class nov26 {
    public int solution(int[] num_list) {
        int answer = 0;
      
        ArrayList<Integer> num_arr_list = new ArrayList<>();
        for(int i : num_list){
            num_arr_list.add(i);
        }
        
        int oddSum = IntStream.range(0, num_arr_list.size())
            .filter(i -> i%2 == 0)
            .map(num_arr_list::get)
            .sum();
        
         int evenSum = IntStream.range(0, num_arr_list.size())
            .filter(i -> i%2 != 0)
            .map(num_arr_list::get)
            .sum();
        
        
        return Math.max(oddSum, evenSum);
    }
}