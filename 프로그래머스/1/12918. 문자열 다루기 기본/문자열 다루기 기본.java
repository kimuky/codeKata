class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int sLen = s.length();
        char[] charArr = s.toCharArray();
        if (sLen == 4 || sLen == 6) {
            for (char c : charArr) {
                if (Character.isAlphabetic(c)) {
                    return false;
                }
            }
            return true;
        }
        
        return answer;
    }
}