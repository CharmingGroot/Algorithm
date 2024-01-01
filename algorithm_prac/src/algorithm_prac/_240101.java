package algorithm_prac;
import java.math.*;

class _240101 {
    public String solution(String a, String b) {
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        String answer = bigA.add(bigB) +"";
        return answer;
    }
}