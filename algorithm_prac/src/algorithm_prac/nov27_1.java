package algorithm_prac;
import java.util.*;

class nov27_1 {
    public int[] solution(int[] arr, int[][] queries) {
        
        
        ArrayList<Integer> temp_arr = new ArrayList<>();

        for(int i : arr){
            temp_arr.add(i);
        }
                
        for(int[] query : queries){
            int sIdx = query[0];
            int eIdx = query[1];
                    
            for(int i=0; i< temp_arr.size(); i++){
                //현재 인덱스가 sIdx 이상, eIdx 이하일때 arr[i] 에 +1
                if(i <= eIdx && i >= sIdx){
                   int replace = temp_arr.get(i)+1;
                                        
                   temp_arr.set(i, replace); 
                                   }
            }
        }
                
        int[] answer = temp_arr.stream()
	                            .mapToInt(Integer::intValue)
    	                        .toArray();
        
        return answer;
    }
}