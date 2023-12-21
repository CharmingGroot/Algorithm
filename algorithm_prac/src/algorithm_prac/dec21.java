package algorithm_prac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

class dec21 {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        HashMap<Integer, Integer> rank_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> temp_list = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++)  rank_map.put(rank[i],i);
        
        for(int i=0; i< rank.length; i++){
            if(attendance[i]){
                temp_list.add(rank[i]);
            }
        }
        
        Collections.sort(temp_list);
        
        
        int a = rank_map.getOrDefault(temp_list.get(0),0);
        int b = rank_map.getOrDefault(temp_list.get(1),0);
        int c = rank_map.getOrDefault(temp_list.get(2),0);
        
        answer = 10000*a + 100*b + c;

        return answer;
    }
}

// 애먹었다.. HashMap 적절히 사용하는게 편한듯..
