package algorithm_prac;
import java.util.*;
import java.util.stream.IntStream;

class nov21 {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> tempArr = new ArrayList<>();
        
        int sIdx = IntStream.range(0,arr.length)
            .filter(i -> 2 == arr[i])
            .findFirst()
            .orElse(-1);
        
        int eIdx = IntStream.range(0,arr.length)
            .filter(i -> arr[i] == 2)
            .reduce((first, second) -> second)
            .orElse(-1);
        
        if(sIdx == -1 && eIdx == -1){
            tempArr.add(-1);
        }
        else if(sIdx == eIdx) {
            tempArr.add(2);
        }        
        else{
            int[] copyArrIdx = Arrays.copyOfRange(arr, sIdx, eIdx+1);
            for(int i : copyArrIdx){
                tempArr.add(i);    
            }
        }
        
        int[] answer = tempArr
                .stream()
                    .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}