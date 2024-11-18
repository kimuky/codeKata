class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        try {
            Integer.parseInt(s);
            if (s.length() == 4 || s.length() == 6) {
            answer = true;
                
            }
        } catch(Exception e) {
            
        }
        
        return answer;
    }
}