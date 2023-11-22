package algorithm_prac;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        ArrayList<Integer> tempArr = new ArrayList<>();
        int[] frontOfArr = Arrays.copyOfRange(num_list, 0, n);
        int[] tailOfArr = Arrays.copyOfRange(num_list, n, num_list.length);
        
        for(int i : tailOfArr){
            tempArr.add(i);
        }
        
        for(int i : frontOfArr){
            tempArr.add(i);
        }
        
        
        
        int[] answer = tempArr.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}