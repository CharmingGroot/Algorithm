package algorithm_prac;
class _240105 {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String menu : order){
            if(menu.contains("americano")) answer += 4500;
            else if(menu.contains("cafelatte")) answer += 5000;
            else if(menu.contains("anything")) answer += 4500;
        }
        
        return answer;
    }
}