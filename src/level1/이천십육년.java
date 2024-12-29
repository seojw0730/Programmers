package level1;

public class 이천십육년 {
	public String solution(int a, int b) {
        int[] days={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diff=0;
        for(int i=0; i<a-1; i++) diff+=days[i];
        diff+=b-1;
        diff%=7;
        String answer;
        switch(diff){
            case 0: answer="FRI"; break;
            case 1: answer="SAT"; break;
            case 2: answer="SUN"; break;
            case 3: answer="MON"; break;
            case 4: answer="TUE"; break;
            case 5: answer="WED"; break;
            default: answer="THU"; break;
        }
        return answer;
    }
}
