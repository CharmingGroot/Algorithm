package algorithm_prac;
import java.util.*;

class dec6 {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] myString_arr = myString.toCharArray();
        ArrayList<Character> temp_arr = new ArrayList<>();
        
        for(char ch : myString_arr){
            if(ch == 'A'){
                temp_arr.add('B');
            }else {
                temp_arr.add('A');
            }
        }
                
        //String result_string = String.valueOf(temp_arr);
        String result_string = temp_arr.stream()
                                            .map(e->e.toString())
                                                .reduce((p,c)-> p + c)
                                                    .get();
        
        
        if(result_string.contains(pat)){
            answer = 1;
        }else {
            answer = 0;
        }
        
        return answer;
    }
}