import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        temp = String.join("", arr);
        
        answer = Long.parseLong(temp);
        
        return answer;
    }
}