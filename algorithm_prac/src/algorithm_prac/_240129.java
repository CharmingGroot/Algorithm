package algorithm_prac;
class _240129 {
    public int[] solution(int n, int m) {
        
        
        int x = recursiveD(n,m);
        int y = recursiveM(n,m);
        int[] answer = {x,y};
        
        return answer;
    }
    
    
    public static int recursiveD(int n, int m){
        if(m == 0) return n;
        return recursiveD(m, n%m);
    }
    
    public static int recursiveM(int n, int m){
        return n * m  / recursiveD(n,m);
    }
}