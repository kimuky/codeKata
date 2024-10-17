import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int worstScore = 2001;
        for (int i = 0; i<score.length; i++) {
            list.add(score[i]);
            if(list.size() > k ){
                Collections.sort(list, Collections.reverseOrder());
                list.remove(list.size()-1);
                answer[i] = list.get(list.size()-1);
            } else {
                worstScore = worstScore < score[i] ? worstScore : score[i];
                answer[i] = worstScore;
            }
        }
        
        return answer;
    }
}