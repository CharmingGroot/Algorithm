package algorithm_prac;
import java.util.*;

class dec6_2 {
    public String[] solution(String myStr) {
        
        ArrayList<String> result = new ArrayList<>();
        
        StringBuilder builder = new StringBuilder();
        for(char ch : myStr.toCharArray()){
            if(ch == 'a' || ch == 'b' || ch == 'c'){
                if(builder.length() > 0){
                    result.add(builder.toString());
                    builder = new StringBuilder();
                }
            }else {
                builder.append(ch);
            }
        }
        
        if(builder.length() > 0){
            result.add(builder.toString());
        }
        
        if(result.isEmpty()){
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}