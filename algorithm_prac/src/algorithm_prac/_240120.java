package algorithm_prac;
class _240120 {
    public long solution(long n) {
        long answer = 0;
        
        long i = 1;
        while((i * i)< n){
            i++;
        }
        
        if(i*i == n){
            answer = (i+1) * (i+1);
        }else {
            answer = -1;
        }
        
        return answer;
    }
}