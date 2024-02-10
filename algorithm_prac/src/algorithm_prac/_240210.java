package algorithm_prac;
import java.util.*;
class _240210 {
    public int solution(int[][] sizes) {
        
        int col = 0;
        int row = 0;
        
        for(int i=0; i< sizes.length; i++){
            int max_v = Math.max(sizes[i][0], sizes[i][1]);
            int min_v = Math.min(sizes[i][0], sizes[i][1]);
            
            row = Math.max(row , max_v);
            col = Math.max(col , min_v);
            
        }
        
        int answer = row * col;
        return answer;
    }
}