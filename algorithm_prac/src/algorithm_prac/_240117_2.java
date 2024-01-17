package algorithm_prac;
class _240117_2 {
    public int[] solution(long n) {
        
        String num_str = Long.toString(n);
        char[] num_arr = num_str.toCharArray();
        
        int[] answer = new int[num_arr.length];
        
        for(int i=0 , j=answer.length-1; i<answer.length; i++, j--){
            answer[i] = Character.getNumericValue(num_arr[j]);
        }
        
        return answer;
    }
}