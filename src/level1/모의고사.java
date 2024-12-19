package level1;

import java.util.*;

class Student implements Comparable<Student>{
    int num, score;
    Student(int num, int score){
        this.num=num;
        this.score=score;
    }
    @Override
    public int compareTo(Student o){
        if(this.score==o.score) return this.num-o.num;
        else return o.score-this.score;
    }
}

public class 모의고사 {
	public int[] solution(int[] answers) {
        List<Student> list=new ArrayList<>();
        int[] answer2=new int[answers.length], answer3=new int[answers.length];
        int tmp2=1;
        for(int i=0; i<answer2.length; i++){
            if(i%2==0) answer2[i]=2;
            else{
                answer2[i]=tmp2++;
                if(tmp2==2) tmp2++;
                if(tmp2>5) tmp2=1;
            }
        }
        int[] tmp3={3, 1, 2, 4, 5};
        for(int i=0; i<answer3.length; i+=2){
            answer3[i]=tmp3[(i/2)%5];
            if(i+1<answer3.length) answer3[i+1]=tmp3[(i/2)%5];
        }
        int score1=0, score2=0, score3=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==i%5+1) score1++;
            if(answers[i]==answer2[i]) score2++;
            if(answers[i]==answer3[i]) score3++;
        }
        list.add(new Student(1, score1));
        list.add(new Student(2, score2));
        list.add(new Student(3, score3));
        Collections.sort(list);
        List<Integer> answerList=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).score==list.get(0).score) answerList.add(list.get(i).num);
        }
        int[] answer=new int[answerList.size()];
        for(int i=0; i<answer.length; i++) answer[i]=answerList.get(i);
        return answer;
    }
}
