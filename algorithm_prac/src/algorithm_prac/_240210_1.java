package algorithm_prac;
import java.util.*;
class _240210_1 {
    public int solution(int[][] sizes) {

        int max_value = Arrays.stream(sizes)
                            .map(array -> Arrays.stream(array).max().orElseThrow())
                                .max(Comparator.naturalOrder()).orElseThrow();
        
        int min_value = Arrays.stream(sizes)
                            .map(array -> Arrays.stream(array).min().orElseThrow())
                                .max(Comparator.naturalOrder()).orElseThrow();
        
        
        int answer = max_value * min_value;
        return answer;
    }
}