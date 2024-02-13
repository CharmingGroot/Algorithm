package algorithm_prac;
import java.util.HashSet;
import java.util.Arrays;

class _240213 {
    public int[] solution(int[] numbers) {
        
        
        HashSet<Integer> new_set = new HashSet<Integer>();

        
        for(int i=numbers.length; i > 0; i--){
            for(int j=i-1; j > 0; j--){
                new_set.add(numbers[i-1] + numbers[j-1]);
            }
        }

        int[] answer = new_set.stream()
                                .mapToInt(Integer::intValue)
                                    .toArray();
        
        Arrays.sort(answer);
        return answer;
    }
}