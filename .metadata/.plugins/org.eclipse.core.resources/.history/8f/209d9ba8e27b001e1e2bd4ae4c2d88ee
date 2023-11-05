package algorithm_prac;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String,Integer> run = new HashMap<>();
        HashMap<String,Integer> fin = new HashMap<>();
        
        
        for(int i=0; i< participant.length; i++){
            
            run.put(participant[i],run.getOrDefault(participant[i],0) +1);
             if(i < participant.length - 1) // 배열의 길이가 다름.
                fin.put(completion[i],fin.getOrDefault(completion[i],0)+1);
        }
        
        String answer = "";
        
        for(int i=0; i< participant.length; i++){
           
            if(i== participant.length-1) return participant[i];
            if(fin.get(participant[i]) ==null) return participant[i];
            if(run.get(participant[i]).equals(fin.get(participant[i]))) continue;
            else {
                return participant[i];
            }
            
        }
        
        return answer;
    }
}