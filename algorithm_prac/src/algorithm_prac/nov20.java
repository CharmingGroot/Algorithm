package algorithm_prac;
class nov20 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i< num_list.length; i++){
            if(!(num_list[i] < 0)) {
                answer = -1;
            }else {
                answer = i;
                break;
            }
        }
        return answer;
    }
}