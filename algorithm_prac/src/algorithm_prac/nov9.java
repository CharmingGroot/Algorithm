package algorithm_prac;

class nov9 {
    public String solution(String my_string, int s, int e) {

        char[] my_string_char = my_string.toCharArray();
        
        if(s<e){
            for(int i=0; i<= (e-s)/2; i++){
                char temp =  my_string_char[s+i];
                my_string_char[s+i] = my_string_char[e-i];
                my_string_char[e-i]= temp;
            }
        } else if(e<s){
            for(int i=0; i<= (s-e)/2; i++){
                char temp =  my_string_char[e+i];
                my_string_char[e+i] = my_string_char[s-i];
                my_string_char[s-i]= temp;
            }
        }
        
        String answer = new String(my_string_char);
        
        return answer;
    }
}