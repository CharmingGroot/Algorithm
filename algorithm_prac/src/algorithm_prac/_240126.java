package algorithm_prac;
class _240126 {
    public int solution(int num) {
        int answer = 0;
        if(num == 1){
            return answer;
        }
        
        long input_num = num;
        while(input_num != 1){
            long mok = input_num%2;
            if(mok == 0){
                input_num = input_num/2;
                answer++;
            }else{
                input_num = (input_num*3)+1;
                answer++;
            }
            
            if(answer == 500){                
                answer = -1;
                break;
            }
            
        }
        
        return answer;
    }
}