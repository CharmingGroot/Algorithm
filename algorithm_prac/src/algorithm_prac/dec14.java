package algorithm_prac;
import java.util.*;

class dec14 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;
        
        int arr1_sum = 0;
        int arr2_sum = 0;
        
        if(!(arr1_length - arr2_length == 0)){
            if(arr2_length > arr1_length) answer = -1;
            else if(arr1_length > arr2_length) answer = 1;
        }else {
            
            for(int i=0; i< arr1.length; i++){
                arr1_sum += arr1[i];
            }
            for(int i=0; i< arr2.length; i++){
                arr2_sum += arr2[i];
            }
            System.out.println(arr2_sum);
            if(arr1_sum == arr2_sum){
                answer = 0;
            }
           
            if(arr2_sum > arr1_sum){
              answer = -1;
            } else if(arr1_sum > arr2_sum){
              answer = 1;
            } 
        }
        
        return answer;
    }
}