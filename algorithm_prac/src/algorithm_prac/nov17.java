package algorithm_prac;

class nov17 {
    public int nov17(int[] arr, int idx) {
        int answer = 0;
        for(int i=0; i< arr.length; i++){
            if(i >= idx){ // idx보다 크면서
                if(arr[i] == 1){ // 배열의 값이 1인
                    answer = i;
                    break;
                } else {
                    answer = -1;
                }
            }
        }
        
        
        return answer;
    }
}