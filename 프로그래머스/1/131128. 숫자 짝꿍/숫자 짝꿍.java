import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        List<String> xList = new ArrayList<>(Arrays.asList(X.split("")));
        List<String> yList = new ArrayList<>(Arrays.asList(Y.split("")));
        
        for (int i = 9; i>=0; i--){
            String strInt = String.valueOf(i);
            
            int a= Collections.frequency(xList, strInt);
            int b= Collections.frequency(yList, strInt);
            
            if (a>0 && b> 0) {
                int min = a> b ? b:a;
                
                if ( i == 0 && answer.length()==0) {
                    return "0";
                }
                
                answer += String.valueOf(strInt.repeat(min));
            }
        }
                    
        if (answer.equals("")) {
            answer = "-1";
        }
            
        return answer;
    }
}