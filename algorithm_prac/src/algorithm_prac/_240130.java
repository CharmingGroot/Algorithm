package algorithm_prac;
class _240130 {
    public int solution(int n) {
        
        String answer_str = "";
        
        while(n != 0){
            
            answer_str += n%3;
            n /= 3;
            
        }
        int answer = Integer.parseInt(answer_str, 3);
        
        return answer;
    }
}