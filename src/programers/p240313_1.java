package programers;

public class p240313_1 {
    public int[] solution(long n) {
    	//자연수 뒤집어 배열로 만들기
        String str = String.valueOf(n);
        //더하기로 형변환 가능
        // String str = ""+n;
         int[] answer = new int[str.length()];

        //int cnt= 0;
        for(int i=0; i<str.length(); i++){
            answer[i]=str.charAt(str.length()-i-1)-'0';
//            answer[i]= (int)(n%10);
//            n/=10;
        }
        return answer;
    }
}
