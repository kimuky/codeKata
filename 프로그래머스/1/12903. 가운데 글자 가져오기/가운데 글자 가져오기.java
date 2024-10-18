class Solution {
    public String solution(String s) {
        String answer = "";
        int sLen = s.length();
        String[] strArr = s.split("");
        
        if (s.length()%2== 0){
            answer = strArr[sLen/2-1] + strArr[sLen/2];
        } else {
            answer = strArr[sLen/2];
        }
        
        
        return answer;
    }
}