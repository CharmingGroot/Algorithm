package algorithm_prac;
import java.util.*;
class _240210_2 {
    public int solution(int[][] sizes) {

        int answer = Arrays.stream(sizes).reduce((a,b) -> new int[] {
        		Math.max(Math.max(a[0], a[1]) , Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(res -> res[0] * res[1]).get(); 
        		
        System.out.println("스트림 결과" + answer);
        		
        return answer;
    }
}