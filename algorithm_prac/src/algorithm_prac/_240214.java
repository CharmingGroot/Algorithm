package algorithm_prac;
import java.util.HashMap;
import java.util.Arrays;

class _240214 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        HashMap<String, Integer> friends_map = new HashMap<String, Integer>();
        
        for(int i=0; i< name.length; i++){
            friends_map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i< photo.length; i++){
            for(int j=0; j< photo[i].length; j++){
                int value = 0;
                
                if(friends_map.get(photo[i][j]) != null){
                  value = friends_map.get(photo[i][j]);  
                } 
                
                answer[i] += value;
                
            }
        }
        
        return answer;
    }
}