class Solution {
    
    int count = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean[dungeons.length];
        backTracking(0,0,k,dungeons);
        answer = count;
        return answer;
    }
    public void backTracking (int depth, int index, int k, int[][] dungeons) {
        if (k >= 0) {
            count = depth > count ? depth : count;      
        } else {
            return;
        }
            
        for (int i = 0; i<dungeons.length; i++) {
            if (!visited[i] && k >=dungeons[i][0]){
                visited[i] = true;
                backTracking(depth+1, i, k- dungeons[i][1], dungeons);
                visited[i]= false;
            }
        }
    }
}