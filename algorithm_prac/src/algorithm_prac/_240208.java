package algorithm_prac;
import java.util.stream.IntStream;
class _240208 {
    public int solution(int[] a, int[] b) {
        int answer = IntStream.range(0, a.length)
                        .map(i -> a[i] * b[i])
                        .sum();
        
        
        return answer;
    }
}