package level1;

public class 비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer=new String[n];
        for(int i=0; i<n; i++){
            answer[i]=Integer.toBinaryString(arr1[i]|arr2[i]).replace("0", " ").replace("1", "#");
            if(answer[i].length()<n) answer[i]=String.format("%"+n+"s", answer[i]);
        }
        return answer;
    }
}
