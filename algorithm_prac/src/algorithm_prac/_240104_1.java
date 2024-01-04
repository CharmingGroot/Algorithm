package algorithm_prac;
class _240104_1 {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(!(a%2 == 0) && !(b%2 == 0)){
            answer = (int) Math.pow(a,2) + (int) Math.pow(b,2);
        }else if(!(a%2 == 0) || !(b%2 == 0)){
            answer = 2 * (a + b);
        } else if((a%2 == 0) && (b%2 == 0)){
            answer = (int) Math.abs(a - b);
        }
        
        return answer;
    }
}