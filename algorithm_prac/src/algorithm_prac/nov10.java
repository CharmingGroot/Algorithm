package algorithm_prac;

class nov10 {
    public String solution(String my_string, int m, int c) {
        
        int strSize =  my_string.length() / m; // �� ����
        
        String[] my_string_arr = new String[strSize];
        
        // 0~2
        // 3~5
        // 6~8
        
        for(int i=0; i< strSize; i++){
            my_string_arr[i] = my_string.substring(i,m);
        }
        
        
        char[] my_char = my_string.toCharArray();
        char[] temp_char = {};
        
        // 0 ~ i*m-1
        // i*m ~ (i+1) * m
        
        for(int i=0; i< strSize; i++){ // �� ������ŭ �ݺ�
            //tempCharArr[i] = my_string_arr[i][c];
            System.out.println(my_char[i]);
        }
        
        String answer = String.valueOf(temp_char);
        System.out.println(answer);
        
        return answer;
    }
}