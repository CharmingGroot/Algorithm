package algorithm_prac;
import java.util.*;
class _240207 {
    public int solution(int[] numbers) {
        int answer = 45 - Arrays.stream(numbers).reduce(0, (a,b) -> (a+b));
        
        return answer;
    }
}