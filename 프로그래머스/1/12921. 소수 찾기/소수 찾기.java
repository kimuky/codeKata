class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for (int i = 3; i<=n; i++) {
            boolean flag = false;
            if (i%2 == 0) {
                continue;
            } else {
                for (int j=2; j<=(int)Math.sqrt(i); j++){
                if (i%j == 0) {
                    flag =true;
                    break;
                }
                }
            }
            
            if(!flag) {
                answer+=1;
            }
        }
        
        
        return answer;
    }
}