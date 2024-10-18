import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split("");
        Arrays.sort(temp, Collections.reverseOrder());
        answer += answer.join("", temp);
        return answer;
    }
}