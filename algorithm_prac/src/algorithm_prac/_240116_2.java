package algorithm_prac;
import java.util.Arrays;
class _240116_2 {
    public double solution(int[] arr) {
        
        
        double sum = Arrays.stream(arr).reduce(0, (a, b)-> a+b);
        double answer = sum / arr.length;
        
        return answer;
    }
}