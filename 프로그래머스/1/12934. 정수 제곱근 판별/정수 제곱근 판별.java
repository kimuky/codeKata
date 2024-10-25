class Solution {
    public long solution(long n) {
        long answer = -1;
        
        try {
            double a= (long)Math.sqrt(n);
            if (Math.pow(a,2)== n) {
                return (long)Math.pow(a+1,2);
            }
            return answer;
        } catch (Exception e) {
            return answer;
        }
    }
}