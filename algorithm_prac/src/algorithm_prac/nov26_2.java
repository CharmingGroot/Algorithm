package algorithm_prac;
import java.util.*;

class nov26_2 {
    public String[] solution(String[] names) {
        
        
        ArrayList<String> names_arr_list = new ArrayList<>();
        for(String i : names){
            names_arr_list.add(i);
        }
        
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i< names_arr_list.size(); i+=5){
            answer.add(names_arr_list.get(i));
        }
        
        String[] result = answer.toArray(new String[answer.size()]);
        
        return result;
    }
}