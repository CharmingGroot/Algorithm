package algorithm_prac;
import java.util.*;
import java.util.stream.IntStream;

import java.util.*;
class nov22 {
    public int[] solution(int[] arr, int[] query) {
        
        for(int i=0; i< query.length; i++){
            if(i%2 == 0){ // ¦
               arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else { // Ȧ
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        
        return arr;
    }
}