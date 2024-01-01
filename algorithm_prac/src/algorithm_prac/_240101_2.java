package algorithm_prac;
import java.util.*;
class _240101_2 {
    public int[] solution(int[] arr, int[] delete_list) {
        
        
        
        // HashMap으로 변경  
        HashMap<Integer,Integer> newMap = new HashMap();
        for(int i=0; i<arr.length; i++){
            newMap.put(arr[i],i);
        }
        
        
        
        // remove
        for(int i=0; i< delete_list.length; i++){
            newMap.remove(delete_list[i]);
        }
        

        // 정렬
        List<Map.Entry<Integer, Integer>> newArr = new ArrayList<>(newMap.entrySet());
        System.out.println(newArr);
        
        newArr.sort(Map.Entry.comparingByValue(Comparator.naturalOrder()));
        
        System.out.println(newArr);
        
        
                
        int[] answer = new int[newArr.size()];
        
        for(int i=0; i< newArr.size(); i++) {
        	answer[i] = newArr.get(i).getKey();
        }
        
        
        
        
        
        return answer;
    }
}