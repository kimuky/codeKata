class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = 0;
        long min =  0;
        min = a > b ? b : a;
        max = a > b ? a: b;
        
        for (Long i = min; i<=max; i++){
            answer += i;
        }
        
        return answer;
    }
}