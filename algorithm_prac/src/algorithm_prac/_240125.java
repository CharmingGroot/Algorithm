package algorithm_prac;
import java.util.Arrays;

class _240125 {
    public int solution(int k, int[] num, int[][] links) {
        int answer = 0;
        
        System.out.println("k : " + k);
        System.out.println("num : " + Arrays.toString(num));
        System.out.println("links : " + Arrays.deepToString(links));
        
        // ����Ʈ��
                
        // num�� k�� ���� ���� ���� ����� ���� ���ϴ� �˰����ΰ�?
        int studentCnt = Arrays.stream(num).reduce(0, (a,b) -> a+b); // num �� ��
        int approximation = studentCnt/k; // �ٻ�ġ
        int leafCnt = 0; // ������ == ���� �������� �� �� �ִ� ���� � �ڽĳ���� ��
        
        // #2-1
        // ���� ���� ū ������ Ž���ϴ� ���. Ž�� Ƚ���� ���� �� ����. 
        // �� �˰��򿡼� ������ �ǹ̰� ����. ������ �ǹ̰� ����.
        
        // 24.01.25 (��) 
        // ����Ž��, �Ķ��Ʈ�� Ž���� ã�ƺ���.
        
        
        Arrays.sort(num);
        
        System.out.println(Arrays.toString(num));
        
        for(int i=num.length-1; i >= num.length-k; i--){
            System.out.println(num[i]);
            
        }
        
        
        
        
        return answer;
    }
}