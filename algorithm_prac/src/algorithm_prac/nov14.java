package algorithm_prac;
class nov14 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        
        for(int i=1; i< (n/k) +1; i++){
            if(k*i <= n){
                answer[i-1] = k*i;
            }
        }
                
        return answer;
    }
}