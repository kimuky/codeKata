import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Integer[] integerScoreArr = new Integer[score.length];
        
        for (int i=0; i<score.length; i++) {
            integerScoreArr[i] = Integer.valueOf(score[i]);
        }
        
        Arrays.sort(integerScoreArr, Collections.reverseOrder());
        
        for (int i : integerScoreArr ){
            stack.push(i) ;
            if (stack.size()==m) {
                answer += stack.peek()*m;
                stack.clear();
            }
        }
        
        
        return answer;
    }
}