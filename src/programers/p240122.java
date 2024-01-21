package programers;
import java.util.*;
public class p240122 {
    public int solution(int[] elements) {
    	//연속 부분 수열 합의 개수
        int[] arr = new int[elements.length*2];
        
        for(int i=0; i<elements.length; i++){
            arr[i] = arr[i+elements.length] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        
        int[] arr2 = {1,2,3};
        for(int i=1; i<=elements.length; i++){
            for(int j=0; j<elements.length; j++){
            	//Arrays.stream().sum() -> 배열 합 구하는 방
                set.add(Arrays.stream(arr,j,j+i).sum());
            }
        }

        return set.size();
    }
}
