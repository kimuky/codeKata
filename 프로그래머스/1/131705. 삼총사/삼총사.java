class Solution {
        int answer = 0;
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        dfs(number, 0, 0,0 );
        return answer;
    }
    
    public void dfs (int[] number, int depth, int sum, int index) {
        if (depth == 3) {
            if (sum == 0) {
                answer +=1;
            }      
            return;
        }
        
        for (int i=index; i<number.length; i++) {
            dfs(number, depth+1, sum+number[i], i+1);
        }
    }
}