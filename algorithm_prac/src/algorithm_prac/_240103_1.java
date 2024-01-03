package algorithm_prac;
class _240103_1 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        String[] str_arr = new String[str_list.length];
        
        for(String str : str_list){
            if(!(str.contains(ex))){
                answer += str;
            }
        }
        
        return answer;
    }
}