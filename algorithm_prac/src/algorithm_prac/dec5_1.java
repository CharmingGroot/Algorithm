package algorithm_prac;
class dec5_1 {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] port = binomial.split(" ");
        
        int port1 = Integer.parseInt(port[0]);
        String op = port[1];
        int port2 = Integer.parseInt(port[2]);
        
        switch(op){
            case "+":
                answer = port1 + port2;
                break;
            case "-":
                answer = port1 - port2;
                break;
            case "*":
                answer = port1 * port2;
                break;
        }
        
        
        return answer;
    }
    
}