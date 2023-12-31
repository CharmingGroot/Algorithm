package algorithm_prac;
import java.util.*;
class dec5 {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        ArrayList<String> temp_arr_list = new ArrayList<>();
        for(String str : answer){
            temp_arr_list.add(str);
        }
        
        String[] result = temp_arr_list.stream()
                                        .filter(str -> !str.isEmpty())
                                            .toArray(String[]::new);
        
        return result;
    }
}