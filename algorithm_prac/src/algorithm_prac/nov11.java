package algorithm_prac;

class nov11 {
    public String solution(String my_string, int m, int c) {
        // StringBuilder로 해결해볼것.
        StringBuilder answer = new StringBuilder();
        int startIdx = c - 1;
        while(startIdx < my_string.length()){
            answer.append(my_string.charAt(startIdx));
                startIdx += m;
        }
        
        
        return answer.toString();
    }
}