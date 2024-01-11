package algorithm_prac;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

class _240111_1 {
    public int[][] solution(int[][] arr) {
                
        ArrayList<ArrayList<Integer>> arr_list = Arrays.stream(arr)
                            .map(row -> Arrays.stream(row)
                                                .boxed()
                                                    .collect(Collectors.toCollection(ArrayList::new)))
                            .collect(Collectors.toCollection(ArrayList::new));
        
        int row = arr.length; // ��
        int col = arr[0].length; // ��
        
        // ���� ���� �� ���ٸ� ���� ä������.
        if(col < row){
            while(col < row){
                for(int i=0; i< arr_list.size(); i++){
                    arr_list.get(i).add(0);
                }
                col++;
            }
        }
        
        // ���� ���� �� ���ٸ�
        if(row < col){
            ArrayList<Integer> addArr = new ArrayList<>(col);
            for(int i=0; i< col; i++){
                addArr.add(0);
            }            
            for(int i=0; i< col-row; i++){
                arr_list.add(addArr);
            }
        }
        
        // ���� ���� �������� ����
         
        int[][] answer = arr_list.stream()
                .map(row2 -> row2.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        
        return answer;
    }
}