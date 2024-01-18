package algorithm_prac;
class _240118 {
    boolean solution(String s) {
        boolean answer = true;

        int p_str = s.replaceAll("[^P^p]","").length();
        int y_str = s.replaceAll("[^Y^y]","").length();
        
        
        if(p_str != y_str) answer = false;
        

        return answer;
    }
}