package algorithm_prac;
class _240116_1 {
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        }else {
            answer = "Odd";
        }
        
        return answer;
    }
}