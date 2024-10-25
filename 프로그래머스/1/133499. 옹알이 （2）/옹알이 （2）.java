import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"};
        String[] temp = new String[babbling.length];
        int index =0;
       
        for (String str : babbling) {
            for (int i=0; i<canSpeak.length; i++ ) {
                str = str.replace(canSpeak[i], String.valueOf(i));
            }
            temp[index++] =str;
        }
        
        for (String t : temp) {
            char[] arr = t.toCharArray();
            char bef = '9';
            boolean tf = true;
            for (char c :arr) {
                if (bef !=c && Character.isDigit(c)) {
                    bef = c;       
                } else {
                    tf = false;
                }
                
            }
            if (tf) {
                answer+=1;
            }

        }
        
        return answer;
    }
}