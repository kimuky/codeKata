import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] temp = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int [] firstStudent = new int[]{1,2,3,4,5};
        int [] secondStudent = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int [] thirdStudent = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int index = 0;
        
        for (int a : answers) {
           int firPoint = index%5; 
           int secPoint = index%8; 
           int thiPoint = index%10; 
            if(a == firstStudent[firPoint]) {
                temp[0] +=1;
            }
            if(a == secondStudent[secPoint]) {
                temp[1] +=1;
            }
            if(a == thirdStudent[thiPoint]) {
                temp[2] +=1;
            }
            index++;
        }
        
        int maxScore = 0;
        for (int t: temp ) {
            if (t >= maxScore) {
                maxScore = t;
            }
        }
        index = 1;
        for (int t: temp){
            if (t == maxScore) {
                list.add(index);
            }
            index++;
        }
        int answerLength = list.size();
        int[] answer = new int[answerLength];
        for (int j= 0; j<answerLength; j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}