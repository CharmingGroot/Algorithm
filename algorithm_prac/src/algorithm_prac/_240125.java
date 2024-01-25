package algorithm_prac;
import java.util.Arrays;

class _240125 {
    public int solution(int k, int[] num, int[][] links) {
        int answer = 0;
        
        System.out.println("k : " + k);
        System.out.println("num : " + Arrays.toString(num));
        System.out.println("links : " + Arrays.deepToString(links));
        
        // 이진트리
                
        // num을 k로 나눈 값에 가장 가까운 값을 구하는 알고리즘인가?
        int studentCnt = Arrays.stream(num).reduce(0, (a,b) -> a+b); // num 의 합
        int approximation = studentCnt/k; // 근사치
        int leafCnt = 0; // 계층수 == 합의 시작점이 될 수 있는 가장 어린 자식노드의 수
        
        // #2-1
        // 값이 가장 큰 노드부터 탐색하는 방법. 탐색 횟수를 줄일 수 있음. 
        // 이 알고리즘에서 계층은 의미가 없음. 연결이 의미가 있지.
        
        // 24.01.25 (목) 
        // 이진탐색, 파라메트릭 탐색을 찾아보자.
        
        
        Arrays.sort(num);
        
        System.out.println(Arrays.toString(num));
        
        for(int i=num.length-1; i >= num.length-k; i--){
            System.out.println(num[i]);
            
        }
        
        
        
        
        return answer;
    }
}