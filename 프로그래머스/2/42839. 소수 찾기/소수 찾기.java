import java.util.*;
class Solution {
    Set <Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        
        String[] numArr = numbers.split("");
        boolean[] visited = new boolean[numArr.length];
        dfs (visited, numArr, 0, "");
        System.out.print(set);
        
        for (Integer i : set) {
            if (isPrime(i)) {
                answer +=1;
            }
        }
        
        return answer;
    }
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public void dfs (boolean[] visited, String[] numArr, int depth, String str) {
        if (depth > 0) {
            int strInt = Integer.valueOf(str);
            set.add(strInt);
            if (depth==numArr.length) {
                return;
            }
        }
        
        
        for (int i = 0; i<numArr.length; i++) {      
            if(!visited[i]) {
                visited[i] = true;
                dfs(visited, numArr, depth+1,str+numArr[i]);
                visited[i] = false;
            }
        }
    }
}