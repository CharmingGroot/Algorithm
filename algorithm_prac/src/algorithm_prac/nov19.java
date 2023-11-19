package algorithm_prac;

import java.util.*;

class nov19 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        
        switch(n){
            case 1:
                answer = Arrays.copyOfRange(num_list,0, slicer[1]+1);
                
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list,slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list,slicer[0], slicer[1]+1);
                break;
            case 4:
                
                for (int i = slicer[0]; i < slicer[1]+1; i += slicer[2]) {
                    tempArr.add(num_list[i]);
                }
                answer = tempArr.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
                
                
                break;
        }
                
        return answer;
    }
}