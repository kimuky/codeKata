class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int phoneLen = phone_number.length();
            
        String endNumber =phone_number.substring(phoneLen-4);
        
        answer += "*".repeat(phoneLen-4) + endNumber; 
        
        return answer;
    }
}