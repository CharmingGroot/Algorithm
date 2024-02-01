package algorithm_prac;
class _240202_1 {
    public int solution(String s) {
       
        String[] number_arr = {"zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i< number_arr.length; i++){
           s = s.replaceAll(number_arr[i], Integer.toString(i));
        }
        
        
        return Integer.parseInt(s);
    }
}