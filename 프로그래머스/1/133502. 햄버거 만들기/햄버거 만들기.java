import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i : ingredient) {
            
            if (stack.size() >= 3 && i ==1) {         
                int meat = stack.pop();
                int veg = stack.pop();
                int bread = stack.pop();
                if (meat == 3 && veg == 2 && bread == 1) {
                    answer +=1;
                } else {
                    stack.push(bread);
                    stack.push(veg);
                    stack.push(meat);
                    stack.push(i);
                }
            } else {
                stack.push(i);  
            }
            
        }
        
        return answer;
    }
}