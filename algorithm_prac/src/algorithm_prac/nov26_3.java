package algorithm_prac;
import java.util.*;

class nov26_3 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> temp_arr = new ArrayList<>();
        
        for(int i=0; i< todo_list.length; i++){
            if(finished[i] == false){
                temp_arr.add(todo_list[i]);
            }
        }
        
        String[] answer = temp_arr.toArray(new String[temp_arr.size()]);
            
        return answer;
    }
}