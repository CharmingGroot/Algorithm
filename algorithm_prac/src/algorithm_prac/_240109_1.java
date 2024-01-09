package algorithm_prac;
import java.util.*;
class _240109_1 {
    public int[][] solution(int n) {
        
        
        ArrayList<ArrayList<Integer>> special_array_list = new ArrayList<>(n);
                
        for(int i=0; i< n; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j < n; j++){
                if(j==i){
                  row.add(1);  
                } 
                else {
                 row.add(0);   
                }
            }
            special_array_list.add(row);
        }
        
        
        int[][] answer = special_array_list.stream()
                                        .map(
                                            rowList -> rowList.stream()
                                                                .mapToInt(Integer::intValue)
                                                                    .toArray())
                                        .toArray(int[][]::new);
        
        return answer;
    }
}