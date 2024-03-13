package programers;

public class p240312_1 {
	//나머지가1이 되는 수  찾
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<n; i++){
            if(n%i==1){
                 answer = i;
                 return answer;
            }
        }
        return answer;
    }
}
