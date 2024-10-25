class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=0; i<n; i++) {
            int temp = answer+1;
            String tempString = String.valueOf(temp);
            while (temp %3 ==0 || tempString.indexOf("3")>=0) {
                temp+=1;
                tempString = String.valueOf(temp);
            }
            answer =temp;
        }
        return answer;
    }
}