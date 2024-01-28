package algorithm_prac;
class _240128_1 {
    public boolean solution(String s) {
        boolean answer = true;
        
        int lth = s.length();
        
        if(!(lth == 4 ) && !(lth == 6)){
            answer = false;            
            return answer;
        }
        
        char[] s_arr = s.toCharArray();
        
        // 48 ~ 57
        for(char ch : s_arr){
            
            if(!((byte)ch < 65)){
                answer = false;
                break;
            }
            else if((byte)ch >= 48 && (byte)ch <= 57){
                answer = true;
            }
        }
        
        return answer;
    }
}