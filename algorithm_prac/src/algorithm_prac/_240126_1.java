package algorithm_prac;
class _240126_1 {
    public String solution(String phone_number) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< phone_number.length() - 4; i++){
            sb.append("*");
        }
        String answer =  sb +  phone_number.substring(phone_number.length()-4);
        
        
        return answer;
    }	
}