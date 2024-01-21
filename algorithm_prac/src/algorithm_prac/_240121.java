package algorithm_prac;
class _240121 {
    public boolean solution(int x) {
        boolean answer = true;
        
        char[] x_str = Integer.toString(x).toCharArray();
        
        int sumIdx = 0;
        
        for(int i=0; i< x_str.length; i++){
            sumIdx += Character.getNumericValue(x_str[i]);
        }
        
        
        if(!((x % sumIdx) == 0)) answer = false;
        
        return answer;
    }
}