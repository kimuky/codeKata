import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue <String> c1List = new LinkedList<String>(Arrays.asList(cards1));
        Queue <String> c2List = new LinkedList<String>(Arrays.asList(cards2));
        int index= 0;
        for (String s : goal) {
            String card1 = c1List.peek();
            String card2 = c2List.peek();
            if (s.equals(card1)){
                c1List.poll();
            } else if (s.equals(card2)) {
                c2List.poll();                   
            } else {
                return "No";
            }
            
            index++;
        }
        return answer;
    }
}