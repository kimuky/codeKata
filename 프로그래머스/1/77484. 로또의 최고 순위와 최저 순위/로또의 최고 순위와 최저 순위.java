import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int zeroCount = 0;
        int count =0;
        
        for (int i : lottos) {
            if (i == 0) {
                zeroCount++;
            } else {
                
            list.add(Integer.valueOf(i));
            }
        }
        
        for (int j : win_nums) {
            if (list.contains(j)) {
                count++;
            }
        }
        
        
        switch (count) {
            case 6: answer[0]= 1;
                answer[1]= 1;break;
            case 5: answer[1] =2 ; break;
            case 4: answer[1]=3; break;
            case 3: answer[1]= 4; break;
            case 2: answer[1]= 5; break;
                default: answer[1] = 6;
        }

            answer[0]= answer[1]-zeroCount;
            if (answer[0] == 0) {
                answer[0] = 1;
            }
            if (count+zeroCount == 1) {
                answer[0]= 6;
            }

        
        return answer;
    }

}